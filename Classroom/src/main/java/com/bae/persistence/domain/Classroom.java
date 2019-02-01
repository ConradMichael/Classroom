package com.bae.persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	public Classroom() {
		
	}
	
	public Classroom(Integer classroom, String trainerName) {
		super();
		this.classroom = classroom;
		this.trainerName = trainerName;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer classroom;
	
	private String trainerName;
	
	//private List<Integer> trainees;

	public Integer getId() {
		return classroom;
	}

	public void setId(Integer classroom) {
		this.classroom = classroom;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

//	public List<Integer> getTrainees() {
//		return trainees;
//	}
//
//	public void setTrainees(List<Integer> trainees) {
//		this.trainees = trainees;
//	}	
//	
//	public void addTrainee(Integer trainee) {
//		this.trainees.add(trainee);
//	}
	
	
}
