package com.kubra.prepay.generated.api;

import com.kubra.prepay.generated.model.Account;
import com.kubra.prepay.generated.model.AccountList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-02T23:56:10.427Z[GMT]")
@Controller
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteAccountById(@ApiParam(value = "The account id",required=true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Account> getAccountById(@ApiParam(value = "The account id",required=true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Account>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountList> getAccountsList(@ApiParam(value = "Size of page to return") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "Page number to retrieve") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<AccountList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Account> registerAccount(@ApiParam(value = "Account request body" ,required=true )  @Valid @RequestBody Account body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Account>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateAccountById(@ApiParam(value = "The account id",required=true) @PathVariable("accountId") String accountId,@ApiParam(value = ""  )  @Valid @RequestBody Account body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
