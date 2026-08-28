package com.huifu.bspay.sdk.opps.core.utils;

import com.huifu.bspay.sdk.opps.core.sign.JsonUtils;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;

/**
 * SM2工具类
 */
public class Sm2Utils {

    // 1. 静态单例 Provider，避免重复创建
    private static final BouncyCastleProvider BC_PROVIDER = new BouncyCastleProvider();
    // 2. 缓存公私钥对象，避免重复解析 (Key为私钥字符串，Value为PrivateKey对象)
    private static final ConcurrentHashMap<String, PrivateKey> PRIVATE_KEY_CACHE = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, PublicKey> PUBLIC_KEY_CACHE = new ConcurrentHashMap<>();


    /**
     * 将 Base64 字符串转为 PrivateKey 对象
     */
    private static PrivateKey getPrivateKey(String privateKeyStr) {
        return PRIVATE_KEY_CACHE.computeIfAbsent(privateKeyStr, key -> {
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("EC", BC_PROVIDER);
                byte[] privateKeyData = Base64.getDecoder().decode(key);
                PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyData);
                return keyFactory.generatePrivate(privateKeySpec);
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new RuntimeException("Invalid Private Key", e);
            }
        });
    }

    /**
     * 获取公钥 (带缓存)
     */
    private static PublicKey getPublicKey(String publicKeyStr) {
        return PUBLIC_KEY_CACHE.computeIfAbsent(publicKeyStr, key -> {
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("EC", BC_PROVIDER);
                byte[] publicKeyData = Base64.getDecoder().decode(key);
                X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyData);
                return keyFactory.generatePublic(publicKeySpec);
            } catch (Exception e) {
                throw new RuntimeException("初始化公钥失败", e);
            }
        });
    }

    /**
     * 加签
     *
     * @param plainText 待签名明文
     * @param privateKeyStr 私钥字符串
     * @return 签名后的字节数组
     */
    public static String sign(String plainText, String privateKeyStr) {
        try {
            // 1. 直接获取缓存好的 Key 对象
            PrivateKey privateKey = getPrivateKey(privateKeyStr);

            // 2. 获取 Signature 实例 (注意：Signature 实例非线程安全，每次需新建，但 Provider 是复用的)
            Signature signature = Signature.getInstance(GMObjectIdentifiers.sm2sign_with_sm3.toString(), BC_PROVIDER);

            // 3. 初始化
            signature.initSign(privateKey);
            signature.update(plainText.getBytes(StandardCharsets.UTF_8)); // 明确指定字符集

            return  Hex.encodeHexString(signature.sign());
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 验签
     *
     * @param plainText      原文
     * @param publicKeyStr   公钥 Base64 字符串
     * @param signatureValue 签名结果 (Hex 字符串)
     * @return 验签结果
     */
    public static boolean verify(String plainText, String publicKeyStr, String signatureValue) {
        try {
            // 1. 从缓存获取公钥对象
            PublicKey publicKey = getPublicKey(publicKeyStr);

            // 2. 获取 Signature 实例 (复用 Provider)
            Signature signature = Signature.getInstance(GMObjectIdentifiers.sm2sign_with_sm3.toString(), BC_PROVIDER);

            // 3. 初始化验签
            signature.initVerify(publicKey);

            // 4. 传入原文
            signature.update(Hex.decodeHex(plainText.toCharArray()));

            // 5. 验证签名
            return signature.verify(Hex.decodeHex(signatureValue.toCharArray()));

        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException | DecoderException e) {
            // 验签过程中的格式错误或算法错误通常意味着验签失败
            return false;
        } catch (Exception e) {
            // 其他运行时异常
            throw new RuntimeException(e);
        }
    }




    /**
     * SM2算法生成密钥对
     *
     * @return 密钥对信息
     */
    public static KeyPair generateSm2KeyPair() {
        try {
            final ECGenParameterSpec sm2Spec = new ECGenParameterSpec("sm2p256v1");
            // 获取一个椭圆曲线类型的密钥对生成器
            final KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC", new BouncyCastleProvider());
            SecureRandom random = new SecureRandom();
            // 使用SM2的算法区域初始化密钥生成器
            kpg.initialize(sm2Spec, random);
            // 获取密钥对
            KeyPair keyPair = kpg.generateKeyPair();
            return keyPair;
        } catch (Exception e) {
            //LogUtils.error("generate sm2 key pair failed:{}", e.getMessage(), e);
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        KeyPair merkeyPair = generateSm2KeyPair();
        KeyPair hfkeyPair = generateSm2KeyPair();

        String merPrivateKey = Base64.getEncoder().encodeToString(merkeyPair.getPrivate().getEncoded());
        String merPublicKey = Base64.getEncoder().encodeToString(merkeyPair.getPublic().getEncoded());

        String hfPrivateKey = Base64.getEncoder().encodeToString(hfkeyPair.getPrivate().getEncoded());
        String hfPublicKey = Base64.getEncoder().encodeToString(hfkeyPair.getPublic().getEncoded());

        String requestData = "{\"req_seq_id\":\"202508210532052761\",\"req_date\":\"20250821\",\"platform_type\":\"05\",\"huifu_id\":\"6666000108980338\",\"phone_number\":\"\",\"account_name\":\"\",\"account_password\":\"\",\"admin_phone_num\":\"\",\"merchant_type\":\"\",\"shop_name\":\"\",\"contract_url\":\"https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/spin/files/斗拱增值业务服务协议_V1.2_20250717.docx\",\"contract_mer_name\":\"徐晓莉\",\"contract_time\":\"1744008692\",\"callback_url\":\"https://hfpayts.cloudpnr.com/link-ser/testCallBack\"}";
        String responseData = "{\"order_no\":\"202509011126519687\",\"smid\":\"2088970773744372\",\"order_status\":\"CONTACT_CONFIRM\",\"resp_desc\":\"成功\",\"qrcode\":\"https://mobilecodec.alipay.com/show.htm?code=2ie189881usyalkarccd0ff\",\"authorize_stat\":\"UNAUTHORIZED\",\"resp_code\":\"00000000\",\"check_result_list\":\"[{\\\"bank_mer_code\\\":\\\"2088970773744372\\\",\\\"channel_type\\\":\\\"N\\\",\\\"check_result\\\":\\\"UNAUTHORIZED\\\"},{\\\"bank_mer_code\\\":\\\"2088970773744372\\\",\\\"channel_type\\\":\\\"U\\\",\\\"check_result\\\":\\\"UNAUTHORIZED\\\"}]\",\"reject_reason\":\"null\"}";

        String sortedRequestData = JsonUtils.sort4JsonString(requestData, 0);
        System.out.println("加密前的请求数据:" + sortedRequestData);
        String merSign = sign(sortedRequestData, merPrivateKey);
        boolean hfVerifyflag = verify(Hex.encodeHexString(sortedRequestData.getBytes()), merPublicKey, merSign);

        System.out.println("------------请求--------------");

        System.out.println("base64后商户的privateKey:" + merPrivateKey);
        System.out.println("base64后商户的publicKey:" + merPublicKey);

        System.out.println("私钥加签后数据(16进制)：" + merSign); //商户传的sign
        System.out.println("使用商户公钥验签结果：" + hfVerifyflag); //汇付验签结果

        System.out.println("------------返回--------------");
        String sortedResponseData =  JsonUtils.sort4JsonString(responseData, 5);
        System.out.println("加密前的返回数据:" + sortedResponseData);

        String hfSign = sign(sortedResponseData, hfPrivateKey); //返回消息中的sign
        boolean merVerifyflag = verify(Hex.encodeHexString(sortedResponseData.getBytes()), hfPublicKey, hfSign); //商户验签结果

        System.out.println("base64后汇付的privateKey:" + hfPrivateKey);
        System.out.println("base64后汇付的publicKey:" + hfPublicKey);
        System.out.println("汇付加签后数据(16进制)：" + hfSign);
        System.out.println("使用商户公钥验签结果：" + merVerifyflag);

    }

}