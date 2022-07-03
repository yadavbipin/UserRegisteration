package com.hire.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Login_Table")
public class LoginUser {

	
	@Id
	private Integer userid;
	@Column(length=20)
	private String username;
	@Column(length=20)
	private String password;
		
}
