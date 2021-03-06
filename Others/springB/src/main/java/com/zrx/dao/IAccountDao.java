package com.zrx.dao;

import com.zrx.demo.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAll();

    Account findById(Integer id);

    Account findByName(String name);

    void update(Account account);
}
