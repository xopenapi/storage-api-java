# CredentialsApi

All URIs are relative to *https://api.xres.lucfish.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CredentialsApi.md#create) | **POST** /oss/credentials | 获取上传凭证 credentials


<a name="create"></a>
# **create**
> CreateUploadCredentialsRsp create(body)

获取上传凭证 credentials

获取上传凭证 credentials

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.xres.lucfish.com");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    CreateUploadCredentialsReq body = new CreateUploadCredentialsReq(); // CreateUploadCredentialsReq | 
    try {
      CreateUploadCredentialsRsp result = apiInstance.create(body);
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
 **body** | [**CreateUploadCredentialsReq**](CreateUploadCredentialsReq.md)|  |

### Return type

[**CreateUploadCredentialsRsp**](CreateUploadCredentialsRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

