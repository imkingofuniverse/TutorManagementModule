package com.tutor.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutor.project.entity.Tutor;
import com.tutor.project.exception.TutorNotFoundException;
import com.tutor.project.service.ITutorService;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/tutor")

public class ITutorController {
	
	@Autowired
	ITutorService iTutorService;
	
	/* Method: insertTutor
	 * Description: It allows to insert the Tutor.
	 * @RequestMapping: It is used to map HTTP requests to handler methods of MVC and REST controllers.
	 * @RestController: It is used to create RESTful web services using MVC.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     */
	
	@PostMapping("/insertTutor")
	public ResponseEntity<Tutor> insertTutor(@RequestBody Tutor tutor) {
		Tutor tutorr = iTutorService.insertTutor(tutor);
		return new ResponseEntity<>(tutorr, HttpStatus.OK);
		
	}
	
	/* Method: updateTutor
	 * Description: It allows to update the Tutor.
	 * @PutMapping: It is used to handle the HTTP PUT requests matched with given URL expression.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     */
	
	@PutMapping("/updateTutor")
	public ResponseEntity<Tutor> updateTutor(@RequestBody Tutor tutor) {
		Tutor tutorr = iTutorService.updateTutor(tutor);
		return new ResponseEntity<>(tutorr, HttpStatus.OK);
	}
	
	/* Method: deleteTutor
	 * Description: It allows to delete the Tutor.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
     */
	
	@DeleteMapping("/deleteTutor")
	public ResponseEntity<Tutor> deleteTutor(@RequestBody Tutor tutor) throws TutorNotFoundException {
		iTutorService.deleteTutor(tutor);
		return new ResponseEntity<>(tutor, HttpStatus.OK);
	}
	
	/* Method: viewTutorOfSubject
	 * Description: It allows to view the Tutors of specific subject.
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @PathVariable: It is used to handle template variables in the request URL
     */
	
	@GetMapping("/viewTutorOfSubject/{tsub}")
	public ResponseEntity<List<Tutor>> viewTutorOfId(@PathVariable String tsub) throws TutorNotFoundException {
		List<Tutor> tutor = iTutorService.viewTutorOfSubject(tsub);
		return new ResponseEntity<>(tutor, HttpStatus.OK);
	}
	
	/* Method: viewTutorOfCity
	 * Description: It allows to view the Tutors of specific city.
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @PathVariable: It is used to handle template variables in the request URL
     */
	
	@GetMapping("/viewTutorOfCity/{tcity}")
	public ResponseEntity<List<Tutor>> viewTutorOfCity(@PathVariable String tcity) throws TutorNotFoundException {
		List<Tutor> tutor = iTutorService.viewTutorOfCity(tcity);
		return new ResponseEntity<>(tutor, HttpStatus.OK);
	}
	
	/* Method: countTutorsOfSubject
	 * Description: It allows to count the Tutors of specific subject.
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @PathVariable: It is used to handle template variables in the request URL
     */
	
	@GetMapping("/countTutorsOfSubject/{tsub}")
	public ResponseEntity<Integer> countTutorsOfSubject(@PathVariable String tsub) throws TutorNotFoundException {
		int tutor = iTutorService.countTutorOfSubject(tsub);
		return new ResponseEntity<>(tutor, HttpStatus.OK);
	}
	
	/* Method: viewAllTutors
	 * Description: It allows to view all the Tutors.
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @PathVariable: It is used to handle template variables in the request URL
     */
	
	@GetMapping("/viewAllTutors")
	public ResponseEntity<Tutor> viewAllTutors() throws TutorNotFoundException{
		List<Tutor> tutor = iTutorService.viewAllTutors();
		return new ResponseEntity(tutor ,HttpStatus.OK);
	}

}
