package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bae.persistence.repository.ClassroomDBRepo;


@Path("/Classrooms")
public class ClassroomEndpoint {
	
	@Inject
	private ClassroomDBRepo service;

	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}
	
	@Path("/findClassroomById/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAccountById(@PathParam("id") Integer id) {
		return service.findClassroomById(id).toString();
	}
	
	@Path("/createClassroom")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.createClassroom(account);
	}

	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Integer id) {
		return service.deleteClassroom(id);
	}

	public void setService(ClassroomDBRepo service) {
		this.service = service;
	}
}
