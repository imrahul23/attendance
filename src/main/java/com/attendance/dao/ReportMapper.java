package com.attendance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.attendance.core.Report;

public class ReportMapper implements ResultSetMapper<Report> {

	public Report map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		return new Report(resultSet.getInt("employeeID"), resultSet.getDate("on_date").toLocalDate(), resultSet.getBoolean("isPresent"), 
				resultSet.getTime("inTime").toLocalTime(), resultSet.getTime("outtime").toLocalTime(), 
				resultSet.getTime("total_break_time").toLocalTime(), resultSet.getTime("time_in_office").toLocalTime());
	}

}
