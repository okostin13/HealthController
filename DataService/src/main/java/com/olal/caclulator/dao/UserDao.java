package com.olal.caclulator.dao;

import com.olal.caclulator.model.User;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface UserDao extends CrudRepository<User,Integer>, Serializable{
}
