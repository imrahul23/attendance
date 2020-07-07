package com.attendance.resources;

import java.time.LocalDate;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.attendance.dao.SampleDao;

@Path("/employee")
public class EmployeeResource {

	private SampleDao sampleDao;

	public EmployeeResource(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}

	// mark absent
	@Path("/absent/{employeeID}/{on_date}")
	@POST
	@Consumes("application/json")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response markAbsent(@PathParam("employeeID") int employeeID, @PathParam("on_date") LocalDate on_date) {
		sampleDao.markAbsent(employeeID, on_date);
		return Response.status(201).entity(sampleDao).build();
	}

//	// add new employee
//	@POST
//	@Path("/addEmployee")
//	@Consumes("application/json")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response addEmployee(Credential credential) {
//
//		Credential result = credential;
//
//		sampleDao.addEmployee(credential.getEmployeeID(), credential.getPassword());
//		return Response.status(201).entity(result).build();
//	}
//
//	// delete employee
//	@DELETE
//	@Path("/removeEmployee/{employeeID}")
//	public Response removeEmployee(@PathParam("employeeID") int employeeID) {
//		sampleDao.removeEmployee(employeeID);
//
//		return Response.status(200).entity("Employee with ID " + employeeID + "successfully deleted").build();
//	}
//
//	// get daily report of all employees
//	@GET
//	@Path("/dailyReport/{employeeID}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Report> viewDailyReport(@PathParam("employeeID") int employeeID) {
//		List<Report> dailyReport = sampleDao.getDailyReport(employeeID);
//		System.out.println(dailyReport);
//		return dailyReport;
//	}

}
