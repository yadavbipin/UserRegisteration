package com.hire.DAO;

import java.util.List;

import com.hire.model.LoginUser;



public interface ILoginUserDAO {

	public List<LoginUser> registerUser(String username,String password)throws Exception;
}
