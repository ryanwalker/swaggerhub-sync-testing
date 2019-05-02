package io.swagger.api;

import io.swagger.model.Account;
import io.swagger.model.AccountList;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountsApiControllerIntegrationTest {

    @Autowired
    private AccountsApi api;

    @Test
    public void deleteAccountByIdTest() throws Exception {
        String accountId = "accountId_example";
        ResponseEntity<Void> responseEntity = api.deleteAccountById(accountId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAccountByIdTest() throws Exception {
        String accountId = "accountId_example";
        ResponseEntity<Account> responseEntity = api.getAccountById(accountId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAccountsListTest() throws Exception {
        Integer pageSize = 56;
        Integer pageNumber = 56;
        ResponseEntity<AccountList> responseEntity = api.getAccountsList(pageSize, pageNumber);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registerAccountTest() throws Exception {
        Account body = new Account();
        ResponseEntity<Account> responseEntity = api.registerAccount(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateAccountByIdTest() throws Exception {
        String accountId = "accountId_example";
        Account body = new Account();
        ResponseEntity<Void> responseEntity = api.updateAccountById(accountId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
