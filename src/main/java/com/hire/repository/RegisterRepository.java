package com.hire.repository;

import org.springframework.data.repository.CrudRepository;

import com.hire.model.User;

public interface RegisterRepository extends CrudRepository<User,Integer>{
	

}
