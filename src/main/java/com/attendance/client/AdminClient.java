package com.attendance.client;

import java.time.LocalDate;

import org.skife.jdbi.v2.DBI;

import com.attendance.dao.SampleDao;

public class AdminClient {
	public static void main(String[] args) {
		DBI dbi = new DBI("jdbc:mysql://localhost:3306/employee_attendance",
                "rahul", "rahul2310");
 
        SampleDao dao = dbi.onDemand(SampleDao.class);	
        
//        System.out.println(dao.getUserList());

//        dao.addEmployee(5, "pass");
        
//        System.out.println(dao.getReportbyID(3));
       
        LocalDate on_date = LocalDate.now();
        
        System.out.println(on_date);
        
        java.sql.Date date = java.sql.Date.valueOf(on_date);
        
        System.out.println(date);
        
        System.out.println(dao.getReportbyID(3));
        
        System.out.println(dao.getReportbyDate(date));
	
	}
	
}
