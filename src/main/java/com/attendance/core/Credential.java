package com.attendance.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public @Data class Credential {

	@JsonProperty
	private int employeeID;

	@JsonProperty
	private String password;	

}
