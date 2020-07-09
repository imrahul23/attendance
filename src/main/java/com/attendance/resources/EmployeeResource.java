package com.attendance.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.attendance.dao.SQLDao;
import com.attendance.model.EmployeeAction;

@Path("/employee")
public class EmployeeResource {

	private SQLDao sqlDao;

	public EmployeeResource(SQLDao sampleDao) {
		this.sqlDao = sampleDao;
	}

	// mark absent
	@Path("/action")
	@PUT
	@Consumes("application/json")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response markAbsent(EmployeeAction employeeAction) {
		if(employeeAction.getAction().equals("absent"))
			sqlDao.markAbsent(employeeAction.getEmployeeID(), java.sql.Date.valueOf(employeeAction.getOn_date().toString()));
		
		else if(employeeAction.getAction().equals("inTime"))
			sqlDao.addInTime(java.sql.Time.valueOf(employeeAction.getTime().toString()), employeeAction.getEmployeeID(), 
					java.sql.Date.valueOf(employeeAction.getOn_date().toString()));
		
		else if(employeeAction.getAction().equals("outTime"))
			sqlDao.addOutTime(java.sql.Time.valueOf(employeeAction.getTime().toString()), employeeAction.getEmployeeID(), 
					java.sql.Date.valueOf(employeeAction.getOn_date().toString()));
		
		else if(employeeAction.getAction().equals("breakTime"))
			sqlDao.breakTime(java.sql.Time.valueOf(employeeAction.getTime().toString()), employeeAction.getEmployeeID(), 
					java.sql.Date.valueOf(employeeAction.getOn_date().toString()));
		
		
		return Response.status(201).entity(employeeAction).build();
	}


	////	// add inTime
//	@Path("/{employeeID}/inTime")
//	@PUT
//	@Consumes("application/json")
//	@Produces({ MediaType.APPLICATION_JSON })
//	public Response addInTime(@PathParam("employeeID") int employeeID, @PathParam("on_date") LocalDateParam on_date) {
//		sampleDao.addInTime(employeeID, on_date);(employeeID, java.sql.Date.valueOf(on_date.toString()));
//		return Response.status(201).entity(sampleDao).build();
//	}

}
