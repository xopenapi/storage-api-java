# storage-api-java

Storage open api
- API version: 1.0.0
  - Build date: 2020-08-10T00:57:47.255+08:00[Asia/Shanghai]

storage open api


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.xopenapi</groupId>
  <artifactId>storage-api-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.xopenapi:storage-api-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/storage-api-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.xres.lucfish.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CredentialsApi* | [**create**](docs/CredentialsApi.md#create) | **POST** /oss/credentials | 获取上传凭证 credentials


## Documentation for Models

 - [CreateUploadCredentialsReq](docs/CreateUploadCredentialsReq.md)
 - [CreateUploadCredentialsRsp](docs/CreateUploadCredentialsRsp.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Signature

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



