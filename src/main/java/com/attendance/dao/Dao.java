package com.attendance.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;

import com.attendance.model.Credential;
import com.attendance.model.Report;

public interface Dao {
	
	// Admin
	
	public List<Credential> getUserList();
	
	void addEmployee(@Bind("employeeID") int employeeID, @Bind("password") String password);
			
	void removeEmployee( @Bind("employeeID") int employeeID );
	
	public List<Report> getReportbyID(@Bind("employeeID") int employeeID);
	
	public List<Report> getReportbyDate(@Bind("on_date") java.sql.Date on_date);
	
	//Employee
	
	void markAbsent(@Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
		
	void addInTime(@Bind("inTime") java.sql.Time inTime, @Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
	
	void addOutTime(@Bind("outtime") java.sql.Time outtime, @Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
	
	void breakTime(@Bind("total_break_time") java.sql.Time total_break_time, @Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
	
//	void addOutTime(@Bind("outtime") java.sql.Time outtime, @Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
	

}
