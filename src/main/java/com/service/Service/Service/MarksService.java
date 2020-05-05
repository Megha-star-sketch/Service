package com.service.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Service.Dao.MarksDao;

@Service
public class MarksService {

	@Autowired
	private MarksDao dao;
}
