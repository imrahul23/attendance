package com.attendance.core;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public @Data class Report {

	@JsonProperty
	private int employeeID;

	@JsonProperty
	private LocalDate onDate;
	
	@JsonProperty
	private boolean isPresent;
	
	@JsonProperty
	private LocalTime inTime;
	
	@JsonProperty
	private LocalTime outTime;
	
	@JsonProperty
	private LocalTime breakTime;
	
	@JsonProperty
	private LocalTime timeInOffice;

	
}
