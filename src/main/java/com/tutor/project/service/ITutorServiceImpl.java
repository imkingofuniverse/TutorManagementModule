package com.tutor.project.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutor.project.entity.Tutor;
import com.tutor.project.exception.TutorNotFoundException;
import com.tutor.project.repository.ITutorRepository;


@Service
public class ITutorServiceImpl implements ITutorService  {
	
	@Autowired
	private ITutorRepository itutorrepository;
	
	/* Method: insertTutor
	 * Description: It inserts the Tutor
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the Tutor. 
     */
	
	@Override
	public Tutor insertTutor(Tutor tutorr) {
		
		Tutor tutor = new Tutor();
		tutor.setTutorId(tutorr.getTutorId());
		tutor.setUsername(tutorr.getUsername());
		tutor.setPassword(tutorr.getPassword());
		tutor.setName(tutorr.getName());
		tutor.setMobile(tutorr.getMobile());
		tutor.setEmail(tutorr.getEmail());
		tutor.setSchoolName(tutorr.getSchoolName());
		tutor.setQualification(tutorr.getQualification());
		tutor.setSubject(tutorr.getSubject());
		tutor.setCity(tutorr.getCity());
		
		/*List<Tutor> tutor = itutorrepository.findAll();
		 * for(Tutor t : tutor) {
		 * if(t.getName().equals(tutorr.getName())) {
		 * throw new DuplicateTutorNameException("Name Already Exists");
		 * }
		 * }		*/
		
		return itutorrepository.save(tutor);
	}
	
	/* Method: updateTutor
	 * Description: It updates the Tutor
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the Tutor. 
     */

	@Override
	public Tutor updateTutor(Tutor tutorr) {
		
		Tutor tutor = new Tutor();
		tutor.setTutorId(tutorr.getTutorId());
		tutor.setUsername(tutorr.getUsername());
		tutor.setPassword(tutorr.getPassword());
		tutor.setName(tutorr.getName());
		tutor.setMobile(tutorr.getMobile());
		tutor.setEmail(tutorr.getEmail());
		tutor.setSchoolName(tutorr.getSchoolName());
		tutor.setQualification(tutorr.getQualification());
		tutor.setSubject(tutorr.getSubject());
		tutor.setCity(tutorr.getCity());
		
		return itutorrepository.save(tutor);
	}
	
	/* Method: deleteTutor
	 * Description: It deletes the Tutor
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the Tutor. 
     */

	@Override
	public Tutor deleteTutor(Tutor tutor) throws TutorNotFoundException {
		
		itutorrepository.delete(tutor);
		
		if(tutor == null)
			throw new TutorNotFoundException("Tutor Not Found Exception");
		return tutor;
	}
	
	/* Method: viewTutorOfSubject
	 * Description: It finds all the tutors by specific subject
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the list of tutors. 
     */

	@Override
	public List<Tutor> viewTutorOfSubject(String subject) throws TutorNotFoundException {
		
		List<Tutor> tutor = itutorrepository.findAll();
		
		
		return tutor.stream().filter((d) -> d.getSubject().equalsIgnoreCase(subject)).collect(Collectors.toList());
	}
	
	/* Method: viewTutorOfCity
	 * Description: It finds all the tutors by specific city
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the list of tutors. 
     */
	
	@Override
	public List<Tutor> viewTutorOfCity(String city) throws TutorNotFoundException {
		
		List<Tutor> tutor = itutorrepository.findAll();
		
		
		return tutor.stream().filter((d) -> d.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
	}
	
	/* Method: countTutorOfSubject
	 * Description: It finds the count of all the cabs of specific type
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns count of number of tutors of specific subject. 
     */

	@Override
	public int countTutorOfSubject(String subject) throws TutorNotFoundException {
		
		List<Tutor> cab = itutorrepository.findAll();
		List<Tutor> c = cab.stream().filter((d) -> d.getSubject().equalsIgnoreCase(subject)).collect(Collectors.toList());
		int n = c.size();

		return n;
		
	}
	
	/* Method: viewAllTutors
	 * Description: It finds all the tutors
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the list of all tutors. 
     */
	
	@Override
	public List<Tutor> viewAllTutors() throws TutorNotFoundException {
	
		return itutorrepository.findAll();
	}

}


