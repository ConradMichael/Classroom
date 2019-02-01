package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {

	public Trainee() {
		
	}
	
	public Trainee(Integer id, String traineeName) {
		super();
		this.id = id;
		this.traineeName = traineeName;
	}

	@Id
	private Integer id;
	
	private String traineeName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String traineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	
	
}
