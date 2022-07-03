package com.hire.model;

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
	private Integer userId;
	
	private String name;
	
	private Address address;
	
	private String email;
	
	private Integer mobile;
	
	private Integer password;
	
	
}
