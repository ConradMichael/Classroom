package com.bae.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.bae.persistence.domain.Classroom;
import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Transactional(SUPPORTS)
public class ClassroomDBRepo implements ClassroomRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	@Override
	@SuppressWarnings("unchecked")
	public String getAllClassrooms() {
		Query getAllQuery = manager.createQuery("SELECT a FROM Classroom a");
		List<Classroom> classrooms = getAllQuery.getResultList();
		return util.getJSONForObject(classrooms);
	}
	
	@Transactional(REQUIRED)
	@Override
	public String createClassroom(String classroom) {
		Classroom newClass = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(newClass);
		return "Classroom Created.";
	}

	@Transactional(REQUIRED)
	@Override
	public String deleteClassroom(Integer id) {
		Classroom classroomById = findClassroomById(id);
		manager.remove(classroomById);
		return "Account Deleted.";
	}

	@Transactional(REQUIRED)
	@Override
	public String updateClassroom(Integer id, String classroom) {
		return null;
	}
	
	public Classroom findClassroomById(Integer id) {
		return manager.find(Classroom.class, id);
	}

//	@Override
//	public String addTrainee(Integer classroomId, Integer traineeId) {
//		Classroom classroomById = findClassroomById(classroomId);
//		classroomById.addTrainee(traineeId);
//		return "Trainee added.";
//	}


}
