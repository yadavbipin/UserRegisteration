package com.hire.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hire.model.User;

public interface RegisterRepository extends CrudRepository<User,Integer>{

	public List<User> findByMobile(@Param("mobile") Long mobile);

	public List<User> findByEmail(@Param("email") String email);
	
	public List<User> findByMobileOrEmail(@Param("mobile") Long mobile ,@Param("email") String email);
	

}
