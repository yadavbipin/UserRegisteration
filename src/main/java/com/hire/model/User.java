package com.hire.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "T_REGISTER")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer userId;
	@Column(name ="NAME")
	private String name;
	@Column(name ="ADDRESS")
	private String address;
	@Column(name ="EMAIL")
	private String email;
	@Column(name ="MOBILE")
	private Long mobile;
	@Column(name ="PASSWORD")
	private String password;
	@Column(name ="IS_EMAIL_VERIFIED")
	private String isEmailverified;
	@Column(name ="IS_MOBILE_VERIFIED")
	private String isMobileVerified;
	
	
	
}
