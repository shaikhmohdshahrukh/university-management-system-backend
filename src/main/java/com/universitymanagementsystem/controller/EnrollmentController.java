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
import com.universitymanagementsystem.entity.Enrollment;
import com.universitymanagementsystem.service.EnrollmentService;

@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/course")
@RestController
public class EnrollmentController {


	@Autowired
    protected EnrollmentService enrollmentService;

	@GetMapping("/enrollments")
	public List<Enrollment> findAllEnrollment() {
		return enrollmentService.findAllEnrollment();
	}

	@GetMapping("/users/{userId}/enrollments")
	public Optional<Enrollment> findAllByUserId(@PathVariable Long userId) {
		return enrollmentService.findAllByUser(userId);
	}

	@GetMapping("/enrollments/{enrollmentId}")
	public ResponseEntity<?> findByCourseId(@PathVariable Long enrollmentId) {
		Optional<Enrollment> optionalEnrollment = enrollmentService.findEnrollmentdById(enrollmentId);
		if (optionalEnrollment.isPresent())
			return new ResponseEntity<Enrollment>(optionalEnrollment.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Enrollment Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/enrollments/{enrollmentId}")
	public ResponseEntity<?> deleteByEnrollmentId(@PathVariable Long enrollmentId) {
		enrollmentService.deleteEnrollment(enrollmentId);
		return new ResponseEntity<String>("Enrollment Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/enrollments")
	public ResponseEntity<?> createEnrollment(@RequestBody Enrollment enrollment) {
		Long id = enrollmentService.createEnrollment(enrollment);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/enrollments/{enrollmentId}")
	public ResponseEntity<?> updateEnrollment(@RequestBody Enrollment enrollment) {
		enrollment = enrollmentService.updateEnrollment(enrollment);
		return new ResponseEntity<Enrollment>(enrollment, HttpStatus.OK);
	} 
}
