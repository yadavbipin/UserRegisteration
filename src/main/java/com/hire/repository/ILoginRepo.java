package com.hire.repository;

import org.springframework.data.repository.CrudRepository;

import com.hire.model.LoginUser;

public interface ILoginRepo extends CrudRepository<LoginUser,Integer>{
    
}
