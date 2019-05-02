/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.kubra.prepay.generated.api;

import com.kubra.prepay.generated.model.Account;
import com.kubra.prepay.generated.model.AccountList;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-02T23:50:43.197Z[GMT]")
@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Delete an account", nickname = "deleteAccountById", notes = "", tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Account deleted"),
        @ApiResponse(code = 404, message = "Account not found") })
    @RequestMapping(value = "/accounts/{accountId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAccountById(@ApiParam(value = "The account id",required=true) @PathVariable("accountId") String accountId);


    @ApiOperation(value = "Get an account", nickname = "getAccountById", notes = "des", response = Account.class, tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The account", response = Account.class) })
    @RequestMapping(value = "/accounts/{accountId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Account> getAccountById(@ApiParam(value = "The account id",required=true) @PathVariable("accountId") String accountId);


    @ApiOperation(value = "List accounts", nickname = "getAccountsList", notes = "Get a list of accounts", response = AccountList.class, tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of accounts", response = AccountList.class) })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AccountList> getAccountsList(@ApiParam(value = "Size of page to return") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "Page number to retrieve") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber);


    @ApiOperation(value = "Register an account", nickname = "registerAccount", notes = "Register an account", response = Account.class, tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = Account.class) })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Account> registerAccount(@ApiParam(value = "Account request body" ,required=true )  @Valid @RequestBody Account body);


    @ApiOperation(value = "Update an account", nickname = "updateAccountById", notes = "", tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account updated, no response body"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Account was not found and thus cannot be updated"),
        @ApiResponse(code = 409, message = "Account has been modified") })
    @RequestMapping(value = "/accounts/{accountId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateAccountById(@ApiParam(value = "The account id",required=true) @PathVariable("accountId") String accountId,@ApiParam(value = ""  )  @Valid @RequestBody Account body);

}
