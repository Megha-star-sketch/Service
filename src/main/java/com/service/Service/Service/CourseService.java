package com.service.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.service.Service.Dao.CourseDao;
import com.service.Service.Model.Course;

public class CourseService {

	@Autowired
	private CourseDao dao;
	
	public Course AddCo(Course co)
	{
		dao.save(co);
		return co;
	}
}
