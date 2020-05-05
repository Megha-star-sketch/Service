package com.service.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Service.Dao.ExamDao;

@Service
public class ExamService {
	
	@Autowired
   private ExamDao dao;	

}
