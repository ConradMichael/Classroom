package com.bae.persistence.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Trainee {

	public Trainee() {
		
	}
	
	public Trainee(Integer id, String traineeName, Integer classroomid) {
		super();
		this.id = id;
		this.traineeName = traineeName;
		this.classroomid = classroomid;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	private String traineeName;
	
	@NotNull
	private Integer classroomid;

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

	public Integer getClassroomid() {
		return classroomid;
	}

	public void setClassroomid(Integer classroomid) {
		this.classroomid = classroomid;
	}
	
	
	
}
