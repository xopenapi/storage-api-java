/*
 * Storage open api
 * storage open api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xopenapi.storage;

import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.auth.Authentication;
import com.xopenapi.auth.HttpSignatureAuth;
import com.xopenapi.auth.XSignatureAuth;
import com.xopenapi.storage.model.CreateUploadCredentialsReq;
import com.xopenapi.storage.model.CreateUploadCredentialsRsp;
import org.junit.Test;
import org.junit.Ignore;

import java.net.URI;
import java.util.*;

/**
 * API tests for CredentialsApi
 */
public class CredentialsApiTest {
    /**
     * 获取上传凭证 credentials
     *
     * 获取上传凭证 credentials
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String apikey = "0b88b62444694267af5f975782440843";
        String apiSecret = "59a9b6f2210340fabb280764fba6d72c";

        Map<String, Authentication> authMap = new HashMap<>();
        authMap.put("Signature", new XSignatureAuth(apikey, apiSecret, "md5", 6000L));
        ApiClient apiClient = new ApiClient(authMap);

        Map<String, Object> extra = new HashMap();
        extra.put("region", "ap-guangzhou");
        extra.put("bucket", "mofanshow-avatar-1252461817");

        CredentialsApi credentialsApi = new CredentialsApi(apiClient);
        CreateUploadCredentialsReq req = new CreateUploadCredentialsReq().channel("qcloud").extra(extra);
        CreateUploadCredentialsRsp response = credentialsApi.create(req);

        System.out.printf("response: %s", response);
    }
}
