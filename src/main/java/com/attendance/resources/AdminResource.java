package com.attendance.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.attendance.core.Credential;
import com.attendance.core.Report;
import com.attendance.dao.SampleDao;

import io.dropwizard.jersey.params.LocalDateParam;

@Path("/admin")
public class AdminResource {

	private SampleDao sampleDao;

	public AdminResource(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}

	// get list of all employees
	@GET
	@Path("/getEmployees")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Credential> getUsers() {
		return sampleDao.getUserList();
	}

	// add new employee
	@POST
	@Path("/addEmployee")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addEmployee(Credential credential) {

		Credential result = credential;

		sampleDao.addEmployee(credential.getEmployeeID(), credential.getPassword());
		return Response.status(201).entity(result).build();
	}

	// delete employee
	@DELETE
	@Path("/removeEmployee/{employeeID}")
	@Consumes("application/json")
	public Response removeEmployee(@PathParam("employeeID") int employeeID) {
		sampleDao.removeEmployee(employeeID);

		return Response.status(200).entity("Employee with ID " + employeeID + "successfully deleted").build();
	}

	// get all report of an employee 
	@GET
	@Path("/dailyReport/emp/{employeeID}")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Report> getReportById(@PathParam("employeeID") int employeeID) {
		List<Report> dailyReport = sampleDao.getReportbyID(employeeID);
		System.out.println(dailyReport);
		return dailyReport;
	}
	
	// get daily report of a date
	@GET
	@Path("/dailyReport/date/{on_date}")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Report> getReportByDate(@PathParam("on_date") LocalDateParam on_date) {
		
		List<Report> dailyReport = new ArrayList<Report>();
			
		dailyReport = sampleDao.getReportbyDate(java.sql.Date.valueOf(on_date.toString()));
		
		System.out.println(dailyReport);
		
		return dailyReport;
	}

}
