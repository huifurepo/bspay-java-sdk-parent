
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

public class UnityCheckRsaUtils {
    private static final String RSA_ALGORITHM = "RSA";
    private static final String RSA_SIGNATURE_ALGORITHM = "SHA256WithRSA";
    public static final String RSA_PUBLIC_KEY = "RSA_PUBLIC_KEY";
    public static final String RSA_PRIVATE_KEY = "RSA_PRIVATE_KEY";
    public static final String EQUAL = "=";
    public static final String AMPERSAND = "&";

    public UnityCheckRsaUtils() {
    }

    public static Map<String, String> generateKeyPair(Integer keysize) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(keysize);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
            RSAPrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();
            String publicKeyBase64 = Base64.getEncoder().encodeToString(publicKey.getEncoded());
            String privateKeyBase64 = Base64.getEncoder().encodeToString(privateKey.getEncoded());
            Map<String, String> ret = new HashMap();
            ret.put("RSA_PUBLIC_KEY", publicKeyBase64);
            ret.put("RSA_PRIVATE_KEY", privateKeyBase64);
            return ret;
        } catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static boolean verify(String data, String publicKeyBase64, String sign) {
        try {
            byte[] bytes = Base64.getDecoder().decode(publicKeyBase64);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(bytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyFactory.generatePublic(keySpec);
            Signature signature = Signature.getInstance("SHA256WithRSA");
            signature.initVerify(publicKey);
            signature.update(data.getBytes("UTF-8"));
            return signature.verify(Base64.getDecoder().decode(sign));
        } catch (Exception var8) {
            var8.printStackTrace();
            return false;
        }
    }

    public static String sign(String data, String privateKeyBase64) {
        try {
            byte[] bytes = Base64.getDecoder().decode(privateKeyBase64);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(bytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
            Signature signature = Signature.getInstance("SHA256WithRSA");
            signature.initSign(privateKey);
            signature.update(data.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(signature.sign());
        } catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public static String encrypt(String content, String publicKey) {
        String outStr = null;

        try {
            byte[] decoded = Base64.getDecoder().decode(publicKey);
            RSAPublicKey pubKey = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(1, pubKey);
            outStr = Base64.getEncoder().encodeToString(cipher.doFinal(content.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return outStr;
    }

    public static String decrypt(String encryptContent, String privateKey) {
        String outStr = null;

        try {
            byte[] inputByte = Base64.getDecoder().decode(encryptContent.getBytes("UTF-8"));
            byte[] decoded = Base64.getDecoder().decode(privateKey);
            RSAPrivateKey priKey = (RSAPrivateKey)KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(2, priKey);
            outStr = new String(cipher.doFinal(inputByte));
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return outStr;
    }


}
