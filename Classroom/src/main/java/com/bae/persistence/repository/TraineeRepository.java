package com.bae.persistence.repository;

public interface TraineeRepository {

	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Integer id);
	String updateTrainee(Integer id, String trainee);
}
