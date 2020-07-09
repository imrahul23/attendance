package com.attendance.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
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
