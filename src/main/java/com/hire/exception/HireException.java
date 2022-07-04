package com.hire.exception;

public class HireException extends Exception{

	
	private final String message;
	
	public HireException(String message) {
		super(message);
		this.message=message;
	}
	
	public HireException(String message,Throwable cause) {
		super(message,cause);
		this.message=message;
	}

	
}
