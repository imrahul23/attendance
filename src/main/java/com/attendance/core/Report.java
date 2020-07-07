package com.attendance.core;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Report {

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

	public Report() {

	}

	public Report(int employeeID, LocalDate onDate, boolean isPresent, LocalTime inTime, LocalTime outTime,
			LocalTime breakTime, LocalTime timeInOffice) {
		super();
		this.employeeID = employeeID;
		this.onDate = onDate;
		this.isPresent = isPresent;
		this.inTime = inTime;
		this.outTime = outTime;
		this.breakTime = breakTime;
		this.timeInOffice = timeInOffice;
	}

	@Override
	public String toString() {
		return "Report [employeeID=" + employeeID + ", onDate=" + onDate + ", isPresent=" + isPresent + ", inTime="
				+ inTime + ", outTime=" + outTime + ", breakTime=" + breakTime + ", timeInOffice=" + timeInOffice + "]";
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
	 * @return the onDate
	 */
	public LocalDate getOnDate() {
		return onDate;
	}

	/**
	 * @param onDate the onDate to set
	 */
	public void setOnDate(LocalDate onDate) {
		this.onDate = onDate;
	}

	/**
	 * @return the isPresent
	 */
	public boolean isPresent() {
		return isPresent;
	}

	/**
	 * @param isPresent the isPresent to set
	 */
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	/**
	 * @return the inTime
	 */
	public LocalTime getInTime() {
		return inTime;
	}

	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(LocalTime inTime) {
		this.inTime = inTime;
	}

	/**
	 * @return the outTime
	 */
	public LocalTime getOutTime() {
		return outTime;
	}

	/**
	 * @param outTime the outTime to set
	 */
	public void setOutTime(LocalTime outTime) {
		this.outTime = outTime;
	}

	/**
	 * @return the breakTime
	 */
	public LocalTime getBreakTime() {
		return breakTime;
	}

	/**
	 * @param breakTime the breakTime to set
	 */
	public void setBreakTime(LocalTime breakTime) {
		this.breakTime = breakTime;
	}

	/**
	 * @return the timeInOffice
	 */
	public LocalTime getTimeInOffice() {
		return timeInOffice;
	}

	/**
	 * @param timeInOffice the timeInOffice to set
	 */
	public void setTimeInOffice(LocalTime timeInOffice) {
		this.timeInOffice = timeInOffice;
	}

}
