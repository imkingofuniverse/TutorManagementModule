package com.tutor.project.service;

import java.util.List;

import com.tutor.project.entity.Tutor;
import com.tutor.project.exception.TutorNotFoundException;


public interface ITutorService {
	
	public Tutor insertTutor(Tutor tutor);

	public Tutor updateTutor(Tutor tutor);

	public Tutor deleteTutor(Tutor tutor) throws TutorNotFoundException;

	public List<Tutor> viewTutorOfSubject(String subject) throws TutorNotFoundException;
	
	public List<Tutor> viewTutorOfCity(String city) throws TutorNotFoundException;

	public int countTutorOfSubject(String subject) throws TutorNotFoundException;
	
	public List<Tutor> viewAllTutors() throws TutorNotFoundException;

}
