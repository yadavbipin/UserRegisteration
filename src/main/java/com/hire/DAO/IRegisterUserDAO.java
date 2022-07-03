package com.hire.DAO;

import com.hire.model.RegisterUser;
import java.util.List;

public interface IRegisterUserDAO {

	public List<RegisterUser> registerUser(String uid)throws Exception;
	
}
