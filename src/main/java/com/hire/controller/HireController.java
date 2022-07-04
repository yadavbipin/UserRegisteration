package com.hire.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hire.exception.HireException;
import com.hire.model.User;
import com.hire.service.IRegisterUserMgmtService;

@RestController
public class HireController {
	
	
	@Autowired
	private IRegisterUserMgmtService registerService;
	
	
	@GetMapping("/test")
	public  String  showLoginForm() {
		
		return "sucess";
	}
	
	@PostMapping("/register")
	public String performRegister(@RequestBody User user) {
		try {
			registerService.performRegister(user);
		} catch (HireException e) {
			return e.getMessage();
		}
		return "Registered successfully";
		
	}
	
	@GetMapping("/verifyEmail/{email}")
	public String verifyEmail(@PathVariable String email) {
		System.out.println(email);
		registerService.setUserVerifiedByEmail(email);
		return "Email verified successfully";
	}
	
	@GetMapping("/sendOTPToMobile/{mobile}")
	public String verifyEmail(@PathVariable Long mobile) {
		// service to sent OTP to user mobile and save it DB so we can validate it later 
		// we can check timeline
		// Let's say 123456 send to user mobile 
		return "OTP send to " + mobile + " successfully";
	}
	
	@GetMapping("/verifyOTP/{mobile}/{otp}")
	public String verifyOTP(@PathVariable Long mobile, @PathVariable Integer otp) {
		// service to validate OTP against user mobile number
		registerService.setUserVerifiedByMobile(mobile);
		return "Mobile number verified successfully";
	}
	
	
}