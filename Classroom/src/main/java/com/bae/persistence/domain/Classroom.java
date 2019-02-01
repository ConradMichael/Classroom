package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classroom {

	public Classroom() {
		
	}
	
	public Classroom(Integer id, String trainerName) {
		super();
		this.id = id;
		this.trainerName = trainerName;
	}

	@Id
	private Integer id;
	
	private String trainerName;

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
	
	
	
}
