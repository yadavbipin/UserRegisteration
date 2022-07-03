package com.hire.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "Register_Table")
public class RegisterUser {

	@Id
	@GeneratedValue
	private Integer ino;
	@Column(length=40)
	private String name;
	@Column(length=100)
	private String address;
	@Column(length=40)
	private String email;
	@Column(length=10)
	private Integer mobile;
	private Integer password;
	
	
}
