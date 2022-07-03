package com.hire.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.hire.model.LoginUser;



public class LoginUserDAOImpl implements ILoginUserDAO{
   private String GET_USER_LOGIN_CRED = "SELECT USERNAME,PASSWORD FROM LOGINTABLE WHERE USERID = ?";
   @Autowired
	private DataSource ds;
	@Override
	public List<LoginUser> registerUser(String username,String password) throws Exception {
		List<LoginUser> loginlist = null;
		try(Connection con=ds.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_USER_LOGIN_CRED)){
			ps.setString(1, username);
			ps.setString(2, password);
			try(ResultSet rs = ps.executeQuery()){
				loginlist = new ArrayList();
				while(rs.next()) {
					LoginUser lu = new LoginUser();
					lu.setUsername(rs.getString(1));
					lu.setPassword(rs.getString(2));
					loginlist.add(lu);
				}//while
			}//try2 with resource
		}//try1 with resource
		catch(Exception e) {
			e.printStackTrace();
			throw e;//exception propogation
		}//catch
		return loginlist;
	}//method
}//class
