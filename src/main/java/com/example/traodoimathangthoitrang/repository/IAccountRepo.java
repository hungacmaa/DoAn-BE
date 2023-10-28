package com.example.traodoimathangthoitrang.repository;

import com.example.traodoimathangthoitrang.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepo extends JpaRepository<Account, Long> {
    Account getAccountByUsernameAndPassword (String user , String pass );
    Account getAccountByUsername(String username);
}
