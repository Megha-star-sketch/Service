package com.service.Service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Service.Model.Exam;

@Repository
public interface ExamDao extends JpaRepository<Exam,Integer>{

}
