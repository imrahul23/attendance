package com.attendance.model;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public @Data class EmployeeAction {
	
	private int employeeID;
	private LocalDate on_date;
	private LocalTime time;
	private String action;
	
}
