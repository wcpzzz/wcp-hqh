package com.mybatislearn.utils.wcputils;


import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.Security;
import java.util.Base64;

/**
 * 小程序 AES 解密工具
 * @author Kilde
 */
@Data
public class WXBizDataCrypt {

    private String appId;
    private String sessionKey;

    public WXBizDataCrypt(String appId, String sessionKey) {
        this.appId = appId;
        this.sessionKey = sessionKey;
    }


    /**
     * 解密成json
     * @param encryptedData
     * @param iv
     * @return
     */
    public JSONObject decrypt(String encryptedData, String iv) {
        byte[] encryptedDataDecode = Base64.getDecoder().decode(encryptedData);
        byte[] sessionKeyDecode = Base64.getDecoder().decode(this.sessionKey);
        byte[] ivDecode = Base64.getDecoder().decode(iv);
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        byte[] decodeData = decode(encryptedDataDecode, sessionKeyDecode, ivDecode);
        String stringData = new String(decodeData);
        JSONObject jsonObject = JSONObject.parseObject(stringData);
        return jsonObject;
    }


    /**
     * 解密算法 AES-128-CBC
     * 填充模式 PKCS#7
     *
     * @param encryptedDataDecode 目标密文
     * @return
     * @throws Exception
     */
    private byte[] decode(byte[] encryptedDataDecode, byte[] sessionKeyDecode, byte[] iv) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            Key sKeySpec = new SecretKeySpec(sessionKeyDecode, "AES");
            cipher.init(Cipher.DECRYPT_MODE, sKeySpec, generateIV(iv));// 初始化
            byte[] result = cipher.doFinal(encryptedDataDecode);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 处理iv
     *
     * @param iv
     * @return
     * @throws Exception
     */
    private AlgorithmParameters generateIV(byte[] iv) throws Exception {
        AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
        params.init(new IvParameterSpec(iv));
        return params;
    }

}
