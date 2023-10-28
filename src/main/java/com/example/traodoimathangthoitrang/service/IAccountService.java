package com.example.traodoimathangthoitrang.service;

import com.example.traodoimathangthoitrang.model.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAccountService extends UserDetailsService {
    Account getAccountLogin(String username, String password);
    Account add(Account account);
}
