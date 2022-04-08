package com.example.account.controller;

import com.example.account.model.Accounts;
import com.example.account.model.Customer;
import com.example.account.repository.AccountRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        var accountDetails = accountRepository.findByCustomerId(customer.getCustomerId());
        if (accountDetails != null) {
            return accountDetails;
        }
        return new Accounts();
    }


}
