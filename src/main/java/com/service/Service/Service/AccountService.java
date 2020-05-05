package com.service.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Service.Dao.AccountDao;

@Service
public class AccountService {

	@Autowired
	private AccountDao dao;
}
