package com.olal.caclulator.dao;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface UserDao extends  CrudRepository<Integer,Integer>, Serializable{
}
