package com.example.traodoimathangthoitrang.controller;

import com.example.traodoimathangthoitrang.model.Account;
import com.example.traodoimathangthoitrang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    IAccountService iAccountService;
    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        try{
            return new ResponseEntity<>(iAccountService.add(account), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(account, HttpStatus.NOT_FOUND);
        }
    }
}
