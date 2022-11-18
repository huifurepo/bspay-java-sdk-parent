/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.utils;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;


public class RsaUtils {
    /**
     * RSA算法
     */
    private static final String RSA_ALGORITHM = "RSA";
    /**
     * RSA2签名算法
     */
    private static final String RSA_SIGNATURE_ALGORITHM = "SHA256WithRSA";
    /**
     * RSA公钥key
     */
    public static final String RSA_PUBLIC_KEY = "RSA_PUBLIC_KEY";
    /**
     * RSA私钥key
     */
    public static final String RSA_PRIVATE_KEY = "RSA_PRIVATE_KEY";
    public static final String EQUAL = "=";
    public static final String AMPERSAND = "&";

    /**
     * 生成RSA公私钥对：密钥格式PKCS8
     *
     * @param keysize 密钥长度：1024, 2048
     * @return RSA公、私钥对Map<String, String>
     * @throws Exception
     */
    public static Map<String, String> generateKeyPair(Integer keysize) {
        // 生成RSA Key
        KeyPairGenerator keyPairGenerator;
        try {
            keyPairGenerator = KeyPairGenerator.getInstance(RSA_ALGORITHM);
            keyPairGenerator.initialize(keysize);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
            RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
            // Key --> Base64
            String publicKeyBase64 = Base64.getEncoder().encodeToString(publicKey.getEncoded());
            String privateKeyBase64 = Base64.getEncoder().encodeToString(privateKey.getEncoded());

            Map<String, String> ret = new HashMap<String, String>();

            ret.put(RSA_PUBLIC_KEY, publicKeyBase64);
            ret.put(RSA_PRIVATE_KEY, privateKeyBase64);
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * RSA公钥验签
     *
     * @param data            待签名字符串
     * @param publicKeyBase64 公钥（Base64编码）
     * @return 验签结果
     * @throws Exception
     */
    public static boolean verify(String data, String publicKeyBase64, String sign) {
        // Base64 --> Key
        try {
            byte[] bytes = Base64.getDecoder().decode(publicKeyBase64);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(bytes);
            KeyFactory keyFactory;
            keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
            PublicKey publicKey = keyFactory.generatePublic(keySpec);
            // verify
            Signature signature = Signature.getInstance(RSA_SIGNATURE_ALGORITHM);
            signature.initVerify(publicKey);
            signature.update(data.getBytes("UTF-8"));
            return signature.verify(Base64.getDecoder().decode(sign));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * RSA私钥签名：签名方式SHA256WithRSA
     *
     * @param data             待签名字符串
     * @param privateKeyBase64 私钥（Base64编码）
     * @return 签名byte[]
     * @throws Exception
     */
    public static String sign(String data, String privateKeyBase64) {
        // Base64 --> Key
        try {
            byte[] bytes = Base64.getDecoder().decode(privateKeyBase64);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(bytes);
            KeyFactory keyFactory;
            keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
            // Sign
            Signature signature = Signature.getInstance(RSA_SIGNATURE_ALGORITHM);
            signature.initSign(privateKey);
            signature.update(data.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(signature.sign());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
	 * RSA公钥加密
	 * @param content   待加密字符串
	 * @param publicKey 公钥(调用方公钥)
	 * @return 密文
	 */
	public static String encrypt(String content, String publicKey) throws Exception {
		String outStr = null;
		byte[] decoded = Base64.getDecoder().decode(publicKey);
		RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePublic(new X509EncodedKeySpec(decoded));
		Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, pubKey);
		outStr = Base64.getEncoder().encodeToString(cipher.doFinal(content.getBytes(StandardCharsets.UTF_8)));
		return outStr;
	}

	/**
	 * RSA私钥解密
	 * @param encryptContent 密文
	 * @param privateKey 私钥(汇付私钥)
	 * @return 明文
	 * @throws Exception 
	 */
	public static String decrypt(String encryptContent, String privateKey) throws Exception {
		String outStr = null;
		byte[] inputByte = Base64.getDecoder().decode(encryptContent.getBytes("UTF-8"));
		byte[] decoded = Base64.getDecoder().decode(privateKey);
		RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(decoded));
		Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
		cipher.init(Cipher.DECRYPT_MODE, priKey);
		outStr = new String(cipher.doFinal(inputByte));
		return outStr;
	}
}
