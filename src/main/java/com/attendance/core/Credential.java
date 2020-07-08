package com.attendance.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public @Data class Credential {

	@JsonProperty
	private int employeeID;

	@JsonProperty
	private String password;	

}
