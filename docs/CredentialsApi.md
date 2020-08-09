# CredentialsApi

All URIs are relative to *https://api.xres.lucfish.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CredentialsApi.md#create) | **POST** /oss/credentials | 获取上传凭证 credentials


<a name="create"></a>
# **create**
> CreateUploadCredentialsRsp create(createUploadCredentialsReq)

获取上传凭证 credentials

获取上传凭证 credentials

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.storage.CredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.xres.lucfish.com");
    

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    CreateUploadCredentialsReq createUploadCredentialsReq = new CreateUploadCredentialsReq(); // CreateUploadCredentialsReq | 
    try {
      CreateUploadCredentialsRsp result = apiInstance.create(createUploadCredentialsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUploadCredentialsReq** | [**CreateUploadCredentialsReq**](CreateUploadCredentialsReq.md)|  | [optional]

### Return type

[**CreateUploadCredentialsRsp**](CreateUploadCredentialsRsp.md)

### Authorization

[Signature](../README.md#Signature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

