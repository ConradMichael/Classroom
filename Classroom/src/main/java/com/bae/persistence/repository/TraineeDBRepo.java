package com.bae.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepo implements TraineeRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	@Override
	@SuppressWarnings("unchecked")
	public String getAllTrainees() {
		Query getAllQuery = manager.createQuery("SELECT a FROM Trainee a");
		List<Trainee> trainees = getAllQuery.getResultList();
		return util.getJSONForObject(trainees);
	}

	@Transactional(REQUIRED)
	@Override
	public String createTrainee(String trainee) {
		Trainee newTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(newTrainee);
		return "Classroom Created.";
	}

	@Transactional(REQUIRED)
	@Override
	public String deleteTrainee(Integer id) {
		Trainee traineeById = findTraineeById(id);
		manager.remove(traineeById);
		return "Account Deleted.";
	}

	@Transactional(REQUIRED)
	@Override
	public String updateTrainee(Integer id, String trainee) {
		return null;
	}
	
	public Trainee findTraineeById(Integer id) {
		return manager.find(Trainee.class, id);
	}
	
}
