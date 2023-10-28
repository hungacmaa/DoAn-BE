package com.example.traodoimathangthoitrang.service.impl;

import com.example.traodoimathangthoitrang.model.Account;
import com.example.traodoimathangthoitrang.model.Role;
import com.example.traodoimathangthoitrang.repository.IAccountRepo;
import com.example.traodoimathangthoitrang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    IAccountRepo iAccountRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.getAccountByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add((GrantedAuthority) account.getRole());
        return new User(account.getUsername(), account.getPassword(), roles);
    }

    @Override
    public Account getAccountLogin(String username, String password) {
        return iAccountRepo.getAccountByUsernameAndPassword(username, password);
    }

    @Override
    public Account add(Account account) {
        account.setRole(new Role(2));
        iAccountRepo.save(account);
        return account;
    }
}
