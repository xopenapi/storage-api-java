package org.openapitools.client;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SignUtil {

    public static String sign(String body, String timestamp, String nonceStr, String uri, String appSecert) {
        StringBuilder sb = new StringBuilder();
        sb.append(body);
        sb.append(timestamp);
        sb.append(nonceStr);
        sb.append(uri);
        sb.append(appSecert);


        byte[] secretBytes = new byte[0];
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(sb.toString().getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        String md5code = new BigInteger(1, secretBytes).toString(16).toUpperCase();
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }

}
