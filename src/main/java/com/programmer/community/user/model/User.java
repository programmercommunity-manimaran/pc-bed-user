package com.programmer.community.user.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String image;
	private long mobilNumber;
	private boolean isBlocked;
	private String addedDate;
	private String lastActiveLogin;

	public User( String firstName, String lastName, String email, String password,
			String image, long mobilNumber, boolean isBlocked, String addedDate, String lastActiveLogin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.image = image;
		this.mobilNumber = mobilNumber;
		this.isBlocked = isBlocked;
		this.addedDate = addedDate;
		this.lastActiveLogin = lastActiveLogin;
	}
 
	public User() {
		super();
	}
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = null;
	}

	public long getMobilNumber() {
		return this.mobilNumber;
	}

	public void setMobilNumber(long mobilNumber) {
		this.mobilNumber = mobilNumber;
	}

	public boolean isBlocked() {
		return this.isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = false;
	}

	public String getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(String addedDate) {
		this.addedDate = new Date().toLocaleString();
	}

	public String getLastActiveLogin() {
		return this.lastActiveLogin;
	}

	public void setLastActiveLogin(String lastActiveLogin) {
		this.lastActiveLogin = lastActiveLogin;
	}

}
