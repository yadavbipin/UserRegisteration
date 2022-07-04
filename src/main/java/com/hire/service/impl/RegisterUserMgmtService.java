package com.hire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hire.exception.HireException;
import com.hire.model.User;
import com.hire.repository.RegisterRepository;
import com.hire.service.IRegisterUserMgmtService;

@Service
public class RegisterUserMgmtService implements IRegisterUserMgmtService {
	@Autowired
    RegisterRepository repository;

	@Override
	public String performRegister(User user) throws HireException {
		validateUserRegistration(user);
		boolean isExists = isUserExist(user);
		if(isExists) {
			throw new HireException("User already exists");
		}
		user.setIsEmailverified("N");
		user.setIsMobileVerified("N");
		repository.save(user);
		
		return "SUCCESS";
	}
	
	public boolean isUserExist(User user) {
		List<User> users = repository.findByMobileOrEmail(user.getMobile(), user.getEmail());
		if(users.size()>0) {
			return true;
		}
		return false;
	}
	
	private void validateUserRegistration(User user) throws HireException {
		if(user == null) {
			throw new HireException("User info cannnot be empty");
		}
		if(user.getMobile() == null && user.getMobile().toString().length() == 10) {
			throw new HireException("User mobile number is either empty or not valid!");
		}
		if(user.getEmail() == null) {
			throw new HireException("User Email cannnot be empty");
		}
		
	}
	
	@Override
	public void sendEmailLinkToUser(String email) {
		//send email to users mail to verify his email id 
	}

	public void sendOTPToUserMobile(Long mobile) {
		
		// will send to OTP to user mobile
		
	}
	
	@Override
	public void setUserVerifiedByEmail(String email) {
		List<User> users =  repository.findByEmail(email);
		User user = users.get(0);
		user.setIsEmailverified("Y");
		repository.save(user);
	}
	
	@Override
	public void setUserVerifiedByMobile(Long mobile) {
		List<User> users =  repository.findByMobile(mobile);
		User user = users.get(0);
		user.setIsMobileVerified("Y");
		repository.save(user);
	}
}
