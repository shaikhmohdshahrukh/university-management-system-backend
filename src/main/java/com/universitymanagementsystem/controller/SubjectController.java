package com.universitymanagementsystem.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import com.universitymanagementsystem.entity.Student;
import com.universitymanagementsystem.entity.Subject;
import com.universitymanagementsystem.service.StudentService;
import com.universitymanagementsystem.service.SubjectService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/std")
public class SubjectController {

	@Autowired
	protected SubjectService subjectService;

	@GetMapping("/subjects")
	public List<Subject> findAllSubject() {
		return subjectService.findAllSubject();
	}

	@GetMapping("/users/{userId}/subjects")
	public Optional<Subject> findAllByUserId(@PathVariable Long userId) {
		return subjectService.findAllByUser(userId);
	}

	@GetMapping("/subjects/{subjectId}")
	public ResponseEntity<?> findBySubjectId(@PathVariable Long subjectId) {
		Optional<Subject> optionalSubject = subjectService.findSubjectById(subjectId);
		if (optionalSubject.isPresent())
			return new ResponseEntity<Subject>(optionalSubject.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Subject Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/subjects/{subjectId}")
	public ResponseEntity<?> deleteBySubjectId(@PathVariable Long subjectId) {
		subjectService.deleteSubject(subjectId);
		return new ResponseEntity<String>("Subject Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/subjects")
	public ResponseEntity<?> createSubject(@RequestBody Subject subject) {
		Long id = subjectService.createSubject(subject);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/subjects/{subjectId}")
	public ResponseEntity<?> updateSubject(@RequestBody Subject subject) {
		subject = subjectService.updateSubject(subject);
		return new ResponseEntity<Subject>(subject, HttpStatus.OK);
	} 
}
