package com.service.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Service.Dao.ResultDao;

@Service
public class ResultService {
	
	@Autowired
	private ResultDao dao;

}
