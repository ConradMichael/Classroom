package com.bae.business.service;

import javax.inject.Inject;

import com.bae.persistence.repository.TraineeRepository;
import com.bae.util.JSONUtil;

public class TraineeServiceImpl implements TraineeService{

	@Inject
	TraineeRepository traineerepo;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllTrainees() {
		return traineerepo.getAllTrainees();
	}

	@Override
	public String createTrainee(String trainee) {
		traineerepo.createTrainee(trainee);
		return "Created Trainee.";
	}

	@Override
	public String deleteTrainee(Integer id) {
		traineerepo.deleteTrainee(id);
		return "Deleted Trainee.";
	}

	@Override
	public String updateTrainee(Integer id, String trainee) {
		traineerepo.updateTrainee(id, trainee);
		return "Update Trainee.";
	}

}
