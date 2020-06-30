package com.muthu.billPayment.model;

public class UserLoginResponseVO {

	private boolean status;

	private String statusMessage;

	private UserDetails userDetailsObject;

	public UserLoginResponseVO() {
		super();
	}

	public UserLoginResponseVO(UserDetails userDetailsObject, boolean status, String statusMessage) {
		super();
		this.userDetailsObject = userDetailsObject;
		this.status = status;
		this.statusMessage = statusMessage;
	}

	public UserDetails getRegistrationObject() {
		return userDetailsObject;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public boolean isStatus() {
		return status;
	}

	public void setRegistrationObject(UserDetails registrationObject) {
		userDetailsObject = registrationObject;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}
