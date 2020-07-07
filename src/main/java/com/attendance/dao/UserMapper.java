package com.attendance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.attendance.core.User;

public class UserMapper implements ResultSetMapper<User>{

	public User map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
		return new User( resultSet.getInt("id") , resultSet.getString("name"), resultSet.getInt("salary") );
	}

}