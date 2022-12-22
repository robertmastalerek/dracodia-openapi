package com.dracodia.openapi.model;

import java.util.Objects;
import com.dracodia.openapi.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-22T15:21:31.744693407+01:00[Europe/Warsaw]")
public class CreateUserRequest   {
  @JsonProperty("userType")
  private String userType;

  @JsonProperty("user")
  private User user;

  public CreateUserRequest userType(String userType) {
    this.userType = userType;
    return this;
  }

  /**
   * Get userType
   * @return userType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public CreateUserRequest user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.userType, createUserRequest.userType) &&
        Objects.equals(this.user, createUserRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

