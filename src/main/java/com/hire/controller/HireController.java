package com.hire.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hire.model.LoginUser;
import com.hire.model.RegisterUser;
import com.hire.service.ILoginUserMgmtService;
import com.hire.service.IRegisterUserMgmtService;

@RestController

public class HireController {

	private IRegisterUserMgmtService registerservice;
	private ILoginUserMgmtService loginservice;
	
//	@GetMapping("/login")
//	public  String  showLoginForm(@ModelAttribute LoginUser userDetails) {
//		userDetails.setUsername("");
//		userDetails.setPassword("");
//		return "login_form";
//	}

	@PostMapping("/login")
	public String  performLogin(Map<String,Object> map,
			                                           @ModelAttribute LoginUser user) {
		
		   return "login_form";
	}//method
	
	@PostMapping("/Register")
	public String performRegister(@ModelAttribute RegisterUser register) {
		
		
		return "register_form";
		
	}

}
