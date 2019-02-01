package com.bae.business.service;

public interface TraineeService {

	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Integer id);
	String updateTrainee(Integer id, String trainee);
	
}
