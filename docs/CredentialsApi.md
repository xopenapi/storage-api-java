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
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Noncestr
    ApiKeyAuth Noncestr = (ApiKeyAuth) defaultClient.getAuthentication("Noncestr");
    Noncestr.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Noncestr.setApiKeyPrefix("Token");

    // Configure API key authorization: Signature
    ApiKeyAuth Signature = (ApiKeyAuth) defaultClient.getAuthentication("Signature");
    Signature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Signature.setApiKeyPrefix("Token");

    // Configure API key authorization: Timestamp
    ApiKeyAuth Timestamp = (ApiKeyAuth) defaultClient.getAuthentication("Timestamp");
    Timestamp.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Timestamp.setApiKeyPrefix("Token");

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

[ApiKey](../README.md#ApiKey), [Noncestr](../README.md#Noncestr), [Signature](../README.md#Signature), [Timestamp](../README.md#Timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取上传凭证 |  -  |

