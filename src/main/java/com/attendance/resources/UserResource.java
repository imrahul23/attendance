//package com.attendance.resources;
//
//import java.util.List;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import com.attendance.core.User;
//import com.attendance.dao.SampleDao;
//
//@Path("/user")
//public class UserResource {
//	
//
//	private SampleDao sampleDao;
//
//	  public UserResource(SampleDao sampleDao) {
//	    this.sampleDao = sampleDao;
//	  }
//
//	  @Path("/getUsers")
//	  @GET
//	  @Produces({MediaType.APPLICATION_JSON})
//	  public List<User> getUsers() {
//	    return sampleDao.getUserList();
//	  }
//
//	  @POST
//	  @Consumes({MediaType.APPLICATION_JSON})
//	  public void addUser(User newUser) {
//	    sampleDao.insertToUser(newUser.getId(), newUser.getName(), newUser.getSalary());
//	  }
//
//	  @Path("{id}")
//	  @DELETE
//	  public void deleteUser(@PathParam("id") int id) {
//	    sampleDao.deleteUser(id);
//	  }
//
//}
