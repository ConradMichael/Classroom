package com.bae.business.service;

import javax.inject.Inject;

import com.bae.persistence.repository.ClassroomRepository;
import com.bae.util.JSONUtil;

public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	ClassroomRepository classrepo;
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllClassrooms() {
		return classrepo.getAllClassrooms();
	}

	@Override
	public String createClassroom(String classroom) {
		classrepo.createClassroom(classroom);
		return "Classroom created.";
	}

	@Override
	public String deleteClassroom(Integer id) {
		classrepo.deleteClassroom(id);
		return "Classroom deleted.";
	}

	@Override
	public String updateClassroom(Integer id, String classroom) {
		classrepo.updateClassroom(id, classroom);
		return "Classroom updated.";
	}

//	@Override
//	public String addTrainee(Integer classroomId, Integer traineeId) {
//		classrepo.addTrainee(classroomId, traineeId);
//		return "Trainee added to Classroom.";
//	}

	
	
}
