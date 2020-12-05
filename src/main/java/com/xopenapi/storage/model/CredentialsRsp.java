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


package com.xopenapi.storage.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.xopenapi.storage.model.OneOfQCloudCredentialsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 获取上传凭证结果
 */
@ApiModel(description = "获取上传凭证结果")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-05T10:51:06.718Z[GMT]")
public class CredentialsRsp {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private OneOfQCloudCredentialsData data;


  public CredentialsRsp code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @ApiModelProperty(required = true, value = "错误码")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public CredentialsRsp msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 错误消息
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误消息")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public CredentialsRsp data(OneOfQCloudCredentialsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * 上传凭证数据
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上传凭证数据")

  public OneOfQCloudCredentialsData getData() {
    return data;
  }


  public void setData(OneOfQCloudCredentialsData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsRsp credentialsRsp = (CredentialsRsp) o;
    return Objects.equals(this.code, credentialsRsp.code) &&
        Objects.equals(this.msg, credentialsRsp.msg) &&
        Objects.equals(this.data, credentialsRsp.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsRsp {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
