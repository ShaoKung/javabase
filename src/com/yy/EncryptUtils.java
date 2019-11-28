package com.yy;

import com.sun.crypto.provider.SunJCE;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.Security;

/**
 * @program: javabase
 * @description: 工具类
 * @author: Andy
 * @create: 2019-11-28 16:09
 **/

public class EncryptUtils {
    private static String DEFAULT_KEY = "national";
    private static String ALGORITHM = "AES";
    private static int GROUPING_LENGTH = 16;
    private Cipher encryptCipher;
    private Cipher decryptCipher;

    public static String byteArr2HexStr(byte[] arrB) throws Exception {
        int iLen = arrB.length;
        StringBuffer sb = new StringBuffer(iLen * 2);

        for(int i = 0; i < iLen; ++i) {
            int intTmp;
            for(intTmp = arrB[i]; intTmp < 0; intTmp += 256) {
            }

            if (intTmp < 16) {
                sb.append("0");
            }

            sb.append(Integer.toString(intTmp, 16));
        }

        return sb.toString();
    }

    public static byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;
        byte[] arrOut = new byte[iLen / 2];

        for(int i = 0; i < iLen; i += 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte)Integer.parseInt(strTmp, 16);
        }

        return arrOut;
    }

    public EncryptUtils() throws Exception {
        this(DEFAULT_KEY);
    }

    public EncryptUtils(String strKey) throws Exception {
        this.encryptCipher = null;
        this.decryptCipher = null;
        Security.addProvider(new SunJCE());
        Key key = this.getKey(strKey.getBytes());
        this.encryptCipher = Cipher.getInstance(ALGORITHM);
        this.encryptCipher.init(1, key);
        this.decryptCipher = Cipher.getInstance(ALGORITHM);
        this.decryptCipher.init(2, key);
    }

    public byte[] encrypt(byte[] arrB) throws Exception {
        return this.encryptCipher.doFinal(arrB);
    }

    public String encrypt(String strIn) throws Exception {
        return byteArr2HexStr(this.encrypt(strIn.getBytes()));
    }

    public byte[] decrypt(byte[] arrB) throws Exception {
        return this.decryptCipher.doFinal(arrB);
    }

    public String decrypt(String strIn) throws Exception {
        return new String(this.decrypt(hexStr2ByteArr(strIn)));
    }

    private Key getKey(byte[] arrKey) throws Exception {
        byte[] arrB = new byte[GROUPING_LENGTH];

        for(int i = 0; i < arrKey.length && i < arrB.length; ++i) {
            arrB[i] = arrKey[i];
        }

        Key key = new SecretKeySpec(arrB, ALGORITHM);
        return key;
    }

    public static void main(String[] args) {
        try {
            String test = "123456";
            EncryptUtils encryptUtils = new EncryptUtils("35c5f774bd4dde63d3d617dbf25d5b21");
            System.out.println("解密后的字符：" + encryptUtils.decrypt("4543496f438e0f9374fad38063c24e0c2da3fb1649307d5f0176e820925396f9"));
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }
}
