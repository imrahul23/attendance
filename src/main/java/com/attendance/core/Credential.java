package com.attendance.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Credential {

	@JsonProperty
	private int employeeID;

	@JsonProperty
	private String password;

	public Credential() {
		
	}
	
	public Credential(int employeeID, String password) {
		super();
		this.employeeID = employeeID;
		this.password = password;
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
