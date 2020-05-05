package com.service.Service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Service.Model.Result;

@Repository
public interface ResultDao extends JpaRepository<Result,Integer>{

}
