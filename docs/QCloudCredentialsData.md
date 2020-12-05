

# QCloudCredentialsData

腾讯云上传凭证数据
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sessionToken** | **String** | 请求时需要用的 token 字符串，最终请求 COS API 时，需要放在 Header 的 x-cos-security-token 字段 | 
**tmpSecretId** | **String** | 临时密钥 Id，可用于计算签名 | 
**tmpSecretKey** | **String** | 临时密钥 Key，可用于计算签名 | 
**startTime** | **Long** | 密钥的起始时间戳（毫秒） | 
**expiredTime** | **Long** | 密钥的失效时间戳（毫秒） | 
**requestId** | **String** | 请求ID | 



