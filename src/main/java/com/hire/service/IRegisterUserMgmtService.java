package com.hire.service;

import com.hire.exception.HireException;
import com.hire.model.User;

public interface IRegisterUserMgmtService {

	public String performRegister(User register) throws HireException;

	public void setUserVerifiedByEmail(String email);

	public void sendEmailLinkToUser(String email);

	public void sendOTPToUserMobile(Long mobile);

	public void setUserVerifiedByMobile(Long mobile);

}
