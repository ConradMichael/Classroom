package com.bae.business.service;

public interface ClassroomService {

	String getAllClassrooms();
	String createClassroom(String classroom);
	String deleteClassroom(Integer id);
	String updateClassroom(Integer id, String classroom);
//	String addTrainee(Integer classroomId, Integer traineeId);
	
}
