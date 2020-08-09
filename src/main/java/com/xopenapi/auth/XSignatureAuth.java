package com.xopenapi.auth;

import com.xopenapi.ApiException;
import com.xopenapi.Pair;
import org.tomitribe.auth.signatures.Algorithm;
import org.tomitribe.auth.signatures.SigningAlgorithm;

import java.net.URI;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class XSignatureAuth implements Authentication {
    private String apikey;
    private String apiSecret;
    // The digest algorithm which is used to calculate a cryptographic digest of the HTTP request body.
    private String digestAlgorithm;
    private long maxSignatureValidity;

    private Random r = new Random();

    public XSignatureAuth(String apikey, String apiSecret, String digestAlgorithm, Long maxSignatureValidity) {
        this.apikey = apikey;
        this.apiSecret = apiSecret;
        this.digestAlgorithm = digestAlgorithm;
        this.maxSignatureValidity = maxSignatureValidity;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getApikey() {
        return this.apikey;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public String getApiSecret() {
        return this.apiSecret;
    }

    /**
     * Returns the digest algorithm which is used to calculate a cryptographic digest of the HTTP request body.
     *
     * @see java.security.MessageDigest
     */
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    /**
     * Sets the digest algorithm which is used to calculate a cryptographic digest of the HTTP request body.
     *
     * The exact list of supported digest algorithms depends on the installed security providers.
     * Every implementation of the Java platform is required to support "MD5", "SHA-1" and "SHA-256".
     * Do not use "MD5" and "SHA-1", they are vulnerable to multiple known attacks.
     * By default, "SHA-256" is used.
     *
     * @param digestAlgorithm The digest algorithm.
     *
     * @see java.security.MessageDigest
     */
    public void setDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }


    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams, String payload, String method, URI uri) throws ApiException {
        try {
            long timestamp = System.currentTimeMillis();
            String nonceStr = String.valueOf(r.nextLong());

            String path = uri.getRawPath();
            if (uri.getRawQuery() != null && !"".equals(uri.getRawQuery())) {
                path += "?" + uri.getRawQuery();
            }

            StringBuilder sb = new StringBuilder();
            sb.append(payload)
                    .append(timestamp)
                    .append(nonceStr)
                    .append(path)
                    .append(this.apiSecret);

            String digest = new String(Base64.getEncoder().encode(MessageDigest.getInstance(this.digestAlgorithm).digest(sb.toString().getBytes())));

            headerParams.put("Timestamp", String.valueOf(timestamp));
            headerParams.put("Noncestr", nonceStr);
            headerParams.put("Signature", digest.toUpperCase());
            headerParams.put("Authorization", "Bearer " + apikey);

        } catch (Exception e) {
            throw new ApiException("Failed to create signature in the HTTP request header: " + e.toString());
        }
    }
}
