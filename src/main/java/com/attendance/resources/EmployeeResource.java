package com.attendance.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.attendance.core.Report;
import com.attendance.dao.SampleDao;

@Path("/employee")
public class EmployeeResource {

	private SampleDao sampleDao;

	public EmployeeResource(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}

	// mark absent
	@Path("/absent")
	@PUT
	@Consumes("application/json")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response markAbsent(Report report) {
		sampleDao.markAbsent(report.getEmployeeID(), java.sql.Date.valueOf(report.getOnDate()));
		return Response.status(201).entity(sampleDao).build();
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
