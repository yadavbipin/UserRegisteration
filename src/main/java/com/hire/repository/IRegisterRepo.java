package com.hire.repository;

import org.springframework.data.repository.CrudRepository;

import com.hire.model.RegisterUser;

public interface IRegisterRepo extends CrudRepository<RegisterUser,Integer>{
	

}
