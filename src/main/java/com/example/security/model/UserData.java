package com.example.security.model;

import org.springframework.stereotype.Component;

@Component
public class UserData {
	private Long userID;
	private String userName;

	public UserData() {
		super();
	}

	public UserData(Long userID, String userName) {
		this.userID = userID;
		this.userName = userName;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserData [userID=" + userID + ", userName=" + userName + "]";
	}

}
