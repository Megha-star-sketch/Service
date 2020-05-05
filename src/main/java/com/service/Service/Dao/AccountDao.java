package com.service.Service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Service.Model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account,Integer>{

}
