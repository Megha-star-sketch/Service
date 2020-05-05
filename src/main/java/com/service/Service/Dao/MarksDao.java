package com.service.Service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Service.Model.Marks;

@Repository
public interface MarksDao extends JpaRepository<Marks,Integer>{

}
