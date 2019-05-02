package com.kubra.prepay.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kubra.prepay.generated.model.AccountStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-02T23:48:13.985Z[GMT]")
public class Account   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("externalAccountId")
  private String externalAccountId = null;

  @JsonProperty("creditBalance")
  private Double creditBalance = null;

  @JsonProperty("paydownBalance")
  private Double paydownBalance = null;

  @JsonProperty("serviceAddressLine1")
  private String serviceAddressLine1 = null;

  @JsonProperty("serviceAddressLine2")
  private String serviceAddressLine2 = null;

  @JsonProperty("accountStatus")
  private AccountStatus accountStatus = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("userId")
  private String userId = null;

  public Account id(String id) {
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

  public Account created(OffsetDateTime created) {
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

  public Account updated(OffsetDateTime updated) {
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

  public Account version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Use as ETag header when modifying accounts
   * @return version
  **/
  @ApiModelProperty(readOnly = true, value = "Use as ETag header when modifying accounts")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Account externalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Account Id provided by client
   * @return externalAccountId
  **/
  @ApiModelProperty(value = "Account Id provided by client")

  public String getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }

  public Account creditBalance(Double creditBalance) {
    this.creditBalance = creditBalance;
    return this;
  }

  /**
   * Get creditBalance
   * @return creditBalance
  **/
  @ApiModelProperty(readOnly = true, value = "")

  public Double getCreditBalance() {
    return creditBalance;
  }

  public void setCreditBalance(Double creditBalance) {
    this.creditBalance = creditBalance;
  }

  public Account paydownBalance(Double paydownBalance) {
    this.paydownBalance = paydownBalance;
    return this;
  }

  /**
   * Get paydownBalance
   * @return paydownBalance
  **/
  @ApiModelProperty(readOnly = true, value = "")

  public Double getPaydownBalance() {
    return paydownBalance;
  }

  public void setPaydownBalance(Double paydownBalance) {
    this.paydownBalance = paydownBalance;
  }

  public Account serviceAddressLine1(String serviceAddressLine1) {
    this.serviceAddressLine1 = serviceAddressLine1;
    return this;
  }

  /**
   * First line of the service address in human readable format. For display purposes only
   * @return serviceAddressLine1
  **/
  @ApiModelProperty(example = "4215 E. Kubra St.", required = true, value = "First line of the service address in human readable format. For display purposes only")
  @NotNull

  public String getServiceAddressLine1() {
    return serviceAddressLine1;
  }

  public void setServiceAddressLine1(String serviceAddressLine1) {
    this.serviceAddressLine1 = serviceAddressLine1;
  }

  public Account serviceAddressLine2(String serviceAddressLine2) {
    this.serviceAddressLine2 = serviceAddressLine2;
    return this;
  }

  /**
   * Second line of the service address in human readable format. For display purposes only
   * @return serviceAddressLine2
  **/
  @ApiModelProperty(example = "Gilbert, AZ 85222", required = true, value = "Second line of the service address in human readable format. For display purposes only")
  @NotNull

  public String getServiceAddressLine2() {
    return serviceAddressLine2;
  }

  public void setServiceAddressLine2(String serviceAddressLine2) {
    this.serviceAddressLine2 = serviceAddressLine2;
  }

  public Account accountStatus(AccountStatus accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

  /**
   * Get accountStatus
   * @return accountStatus
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public AccountStatus getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(AccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(example = "M-Power Pre-Pay Account", value = "")

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Account userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Id of the user associated with this account
   * @return userId
  **/
  @ApiModelProperty(example = "123ADE5Z", value = "Id of the user associated with this account")

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.created, account.created) &&
        Objects.equals(this.updated, account.updated) &&
        Objects.equals(this.version, account.version) &&
        Objects.equals(this.externalAccountId, account.externalAccountId) &&
        Objects.equals(this.creditBalance, account.creditBalance) &&
        Objects.equals(this.paydownBalance, account.paydownBalance) &&
        Objects.equals(this.serviceAddressLine1, account.serviceAddressLine1) &&
        Objects.equals(this.serviceAddressLine2, account.serviceAddressLine2) &&
        Objects.equals(this.accountStatus, account.accountStatus) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.userId, account.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, version, externalAccountId, creditBalance, paydownBalance, serviceAddressLine1, serviceAddressLine2, accountStatus, accountType, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    creditBalance: ").append(toIndentedString(creditBalance)).append("\n");
    sb.append("    paydownBalance: ").append(toIndentedString(paydownBalance)).append("\n");
    sb.append("    serviceAddressLine1: ").append(toIndentedString(serviceAddressLine1)).append("\n");
    sb.append("    serviceAddressLine2: ").append(toIndentedString(serviceAddressLine2)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
