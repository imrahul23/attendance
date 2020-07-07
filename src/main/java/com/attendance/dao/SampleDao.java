package com.attendance.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import com.attendance.core.Credential;
import com.attendance.core.User;

public interface SampleDao {
	
	
	//User
	
//	@SqlQuery("select * from user")
//	@Mapper(UserMapper.class)
//	public List<User> getUserList();
	
//	@SqlQuery("select id, name, salary from user where id=:id")
//	@Mapper(UserMapper.class)
//	User findById(@Bind("id") int id);
	
//	@SqlUpdate("insert into user (id, name, salary) values (:id, :name, :salary)")
//	void insertToUser(@Bind("id") int id, @Bind("name") String name, @Bind("salary") int salary);
			
//	@SqlUpdate("DELETE FROM user WHERE id = :id")
//	void deleteUser( @Bind("id") int id );
	
	
	//Admin
	@SqlQuery("select * from credentials")
	@Mapper(AdminMapper.class)
	public List<Credential> getUserList();
	
	@SqlUpdate("insert into credentials (employeeID, password) values (:employeeID, :password)")
	void addEmployee(@Bind("employeeID") int employeeID, @Bind("password") String password);
			
	@SqlUpdate("DELETE FROM credentials WHERE employeeID = :employeeID")
	void removeEmployee( @Bind("employeeID") int employeeID );
	
	
	
	
	
	//Employee
	
	

}
