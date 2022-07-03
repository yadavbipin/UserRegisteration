package com.hire.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hire.model.User;
import com.hire.service.IRegisterUserMgmtService;

@RestController
public class HireController {

	private IRegisterUserMgmtService registerService;
	
	
//	@GetMapping("/login")
//	public  String  showLoginForm(@ModelAttribute LoginUser userDetails) {
//		userDetails.setUsername("");
//		userDetails.setPassword("");
//		return "login_form";
//	}

	@PostMapping("/login")
	public String  performLogin(Map<String,Object> map) {
		
		   return "login_form";
	}//method
	
	@PostMapping("/register")
	public String performRegister(@ModelAttribute User user) {
		System.out.println(user);
		registerService.performRegister(user);
		
		return "register_form";
		
	}

}
