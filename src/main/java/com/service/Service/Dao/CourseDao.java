package com.service.Service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Service.Model.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer>{

}
