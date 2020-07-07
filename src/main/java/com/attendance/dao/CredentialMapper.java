package com.attendance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.attendance.core.Credential;

public class CredentialMapper implements ResultSetMapper<Credential>{
	
	public Credential map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
		return new Credential(resultSet.getInt("employeeID"), null);
	}
}
