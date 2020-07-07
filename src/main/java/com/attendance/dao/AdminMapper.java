package com.attendance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.attendance.core.Credential;
import com.attendance.core.Report;

public class AdminMapper implements ResultSetMapper<Credential>{

//	public Report map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
//		return new Report( resultSet.getInt("employeeID"), null, false, null, null, null, null );
//	}
	
	public Credential map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
		return new Credential(resultSet.getInt("employeeID"), resultSet.getString("password"));
	}
}
