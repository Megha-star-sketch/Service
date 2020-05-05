package com.service.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Service.Dao.FeesDao;

@Service
public class FeesService {
	
	@Autowired
	private FeesDao dao;

}
