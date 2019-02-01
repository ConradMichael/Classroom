package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classroom {

	public Classroom() {
		
	}
	
	public Classroom(Integer id, String trainerName, Integer[] classrooms) {
		super();
		this.id = id;
		this.trainerName = trainerName;
		this.classrooms = classrooms;
	}

	@Id
	private Integer id;
	
	private String trainerName;
	
	private Integer[] classrooms;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Integer[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(Integer[] classrooms) {
		this.classrooms = classrooms;
	}
	
	
	
	
	
}
