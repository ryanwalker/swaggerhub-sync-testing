package com.kubra.prepay.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-02T23:56:10.427Z[GMT]")
public class User   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("externalUserId")
  private String externalUserId = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("familyName")
  private String familyName = null;

  public User id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public User updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public User externalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  /**
   * Optional user identifier from client system
   * @return externalUserId
  **/
  @ApiModelProperty(example = "123AAEE", value = "Optional user identifier from client system")

  public String getExternalUserId() {
    return externalUserId;
  }

  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
  }

  public User givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Given name of the user associated with this account
   * @return givenName
  **/
  @ApiModelProperty(example = "Bob", required = true, value = "Given name of the user associated with this account")
  @NotNull

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public User familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Family name of the user associated with this account
   * @return familyName
  **/
  @ApiModelProperty(example = "Builder", required = true, value = "Family name of the user associated with this account")
  @NotNull

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.updated, user.updated) &&
        Objects.equals(this.externalUserId, user.externalUserId) &&
        Objects.equals(this.givenName, user.givenName) &&
        Objects.equals(this.familyName, user.familyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, externalUserId, givenName, familyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
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
