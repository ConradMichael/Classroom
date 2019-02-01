package com.bae.persistence.repository;

public interface ClassroomRepository {

	String getAllClassrooms();
	String createClassroom(String classroom);
	String deleteClassroom(Integer id);
	String updateClassroom(Integer id, String classroom);
	//String addTrainee(Integer classroomId, Integer traineeId);
	
}
