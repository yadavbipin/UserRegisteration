package com.hire.DAO;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.hire.model.RegisterUser;

public class RegisterUserDAOImpl implements IRegisterUserDAO{

	private static final String PUT_USER_BY_ID = "INSERT INTO TABLE() VALUES(?,?,?)";
	
	private DataSource ds;
	@Override
	public List<RegisterUser> registerUser(String uid) throws Exception {
		System.out.println("EmployeeDAOImpl.getUserByID()::ds class name "+ds.getClass());
		List<RegisterUser> list = null; 
		try(Connection con =ds.getConnection();
				PreparedStatement ps = con.prepareStatement(PUT_USER_BY_ID)) {
					
				}
		return null;
	}
 
	
	
	
	
}
