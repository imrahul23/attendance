package com.attendance.resources;

import java.time.LocalDate;
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
import com.attendance.core.User;
import com.attendance.dao.SampleDao;

@Path("/admin")
public class AdminResource {

	private SampleDao sampleDao;

	public AdminResource(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}

	@Path("/getEmployees")
	@GET
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
	public Response removeEmployee(@PathParam("employeeID") int employeeID) {
		sampleDao.removeEmployee(employeeID);

		return Response.status(200).entity("Employee with ID " + employeeID + "successfully deleted").build();
	}

//	// get daily report of all employees
//	@GET
//	@Path("/dailyReport")
//	@Produces(MediaType.APPLICATION_JSON)
//	public ArrayList<Report> viewDailyReport() {
//		ArrayList<Report> dailyReport = sampleDao.viewDailyReport(LocalDate.now());
//		System.out.println(dailyReport);
//		return sampleDao.viewDailyReport(LocalDate.now());
//	}

}
