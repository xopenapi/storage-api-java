/*
 * storage open api
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

import com.xopenapi.ApiException;
import com.xopenapi.storage.model.CredentialsReq;
import com.xopenapi.storage.model.CredentialsRsp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CredentialsApi
 */
@Ignore
public class CredentialsApiTest {

    private final CredentialsApi api = new CredentialsApi();

    
    /**
     * 获取上传凭证
     *
     * 获取上传凭证
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void credentialsTest() throws ApiException {
        CredentialsReq credentialsReq = null;
        CredentialsRsp response = api.credentials(credentialsReq);

        // TODO: test validations
    }
    
}
