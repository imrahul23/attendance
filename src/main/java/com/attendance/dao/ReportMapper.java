package com.attendance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.attendance.core.Report;

public class ReportMapper implements ResultSetMapper<Report> {

	public Report map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
//		return new Report(resultSet.getInt("employeeID"), resultSet.getDate("on_date").toLocalDate(), resultSet.getBoolean("isPresent"), 
//				resultSet.getTime("inTime").toLocalTime(), resultSet.getTime("outtime").toLocalTime(), 
//				resultSet.getTime("total_break_time").toLocalTime(), resultSet.getTime("time_in_office").toLocalTime());
		
		Report.ReportBuilder builder = Report.builder();
		
		
		
		builder.employeeID(resultSet.getInt("employeeID"))
		.onDate(resultSet.getDate("on_date").toLocalDate())
		.isPresent(resultSet.getBoolean("isPresent"));
		
		
		if(resultSet.getBoolean("isPresent"))
			builder.inTime(resultSet.getTime("inTime").toLocalTime())
					.outTime(resultSet.getTime("outtime").toLocalTime())
					.breakTime(resultSet.getTime("total_break_time").toLocalTime())
					.timeInOffice(resultSet.getTime("time_in_office").toLocalTime());
		
		return builder.build();
		
	}

}
