package com.bae.persistence.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Classroom {

	public Classroom() {
		
	}
	
	public Classroom(Integer classroomid, String trainerName) {
		super();
		this.classroomid = classroomid;
		this.trainerName = trainerName;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer classroomid;
	
	private String trainerName;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "classroomid", cascade = CascadeType.ALL)
	private Collection<Trainee> trainees = new LinkedHashSet<Trainee>();

	public Integer getId() {
		return classroomid;
	}

	public void setId(Integer classroomid) {
		this.classroomid = classroomid;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

//	public List<Trainee> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Trainee> comments) {
//		this.comments = comments;
//	}

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
