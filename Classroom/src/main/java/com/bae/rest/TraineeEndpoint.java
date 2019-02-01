package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bae.persistence.repository.TraineeDBRepo;

@Path("/Trainees")
public class TraineeEndpoint {
	
	@Inject
	private TraineeDBRepo service;

	@Path("/getAllTrainees")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainees() {
		return service.getAllTrainees();
	}
	
	@Path("/findTraineeById/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAccountById(@PathParam("id") Integer id) {
		return service.findTraineeById(id).toString();
	}
	
	@Path("/createTrainee")
	@POST
	@Produces({ "application/json" })
	public String addTrainees(String account) {
		return service.createTrainee(account);
	}

	@Path("/deleteTrainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") Integer id) {
		return service.deleteTrainee(id);
	}

}
