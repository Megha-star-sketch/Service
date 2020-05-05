package com.service.Service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Service.Model.Fees;

@Repository
public interface FeesDao extends JpaRepository<Fees,Integer>{

}
