package com.attendance.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import com.attendance.model.Credential;
import com.attendance.model.Report;

public interface SQLDao extends Dao {
	
	//Admin
	@SqlQuery("select * from credentials")
	@Mapper(CredentialMapper.class)
	public List<Credential> getUserList();
	
	@SqlUpdate("insert into credentials (employeeID, password) values (:employeeID, :password)")
	void addEmployee(@Bind("employeeID") int employeeID, @Bind("password") String password);
			
	@SqlUpdate("DELETE FROM credentials WHERE employeeID = :employeeID")
	void removeEmployee( @Bind("employeeID") int employeeID );
	
	@SqlQuery("select * from daily_report where employeeID = :employeeID")
	@Mapper(ReportMapper.class)
	public List<Report> getReportbyID(@Bind("employeeID") int employeeID);
	
	@SqlQuery("select * from daily_report where on_date = :on_date")
	@Mapper(ReportMapper.class)
	public List<Report> getReportbyDate(@Bind("on_date") java.sql.Date on_date);
	
	
	//Employee
	@SqlUpdate("insert into daily_report(employeeID, on_date, isPresent) values(:employeeID, :on_date, false)")
	void markAbsent(@Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
	
	@SqlUpdate("insert into daily_report(inTime) values(:inTime) where employeeID = :employeeID and on_date = : on_date")
	void addInTime(@Bind("inTime") java.sql.Time inTime, @Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
	
	@SqlUpdate("insert into daily_report(outtime) values(:outtime) where employeeID = :employeeID and on_date = : on_date")
	void addOutTime(@Bind("outtime") java.sql.Time outtime, @Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);

	@SqlUpdate("insert into daily_report(total_break_time) values(:total_break_time) where employeeID = :employeeID and on_date = : on_date")
	void breakTime(@Bind("total_break_time") java.sql.Time total_break_time, @Bind("employeeID") int employeeID, @Bind("on_date") java.sql.Date on_date);
	
}
