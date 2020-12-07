# CredentialsApi

All URIs are relative to *https://api.lucfish.com/storage/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**credentials**](CredentialsApi.md#credentials) | **POST** /credentials | 获取上传凭证


<a name="credentials"></a>
# **credentials**
> CredentialsRsp credentials(credentialsReq)

获取上传凭证

获取上传凭证

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
    defaultClient.setBasePath("https://api.lucfish.com/storage/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    CredentialsReq credentialsReq = new CredentialsReq(); // CredentialsReq | 
    try {
      CredentialsRsp result = apiInstance.credentials(credentialsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#credentials");
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
 **credentialsReq** | [**CredentialsReq**](CredentialsReq.md)|  | [optional]

### Return type

[**CredentialsRsp**](CredentialsRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取上传凭证 |  -  |

