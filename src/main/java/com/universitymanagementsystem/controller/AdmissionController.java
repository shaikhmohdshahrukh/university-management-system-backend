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
import com.universitymanagementsystem.entity.Admission;
import com.universitymanagementsystem.service.AdmissionService;

@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/course")
@RestController
public class AdmissionController {

	@Autowired
	protected AdmissionService admissionService;

	@GetMapping("/admissions")
	public List<Admission> findAllAdmission() {
		return admissionService.findAllAdmission();
	}

	@GetMapping("/users/{userId}/admissions")
	public Optional<Admission> findAllByUserId(@PathVariable Long userId) {
		return admissionService.findAllByUser(userId);
	}

	@GetMapping("/admissions/{admissionId}")
	public ResponseEntity<?> findByAdmissionId(@PathVariable Long admissionId) {
		Optional<Admission> optionalAdmission = admissionService.findAdmissionById(admissionId);
		if (optionalAdmission.isPresent())
			return new ResponseEntity<Admission>(optionalAdmission.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Admission Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/admissions/{admissionId}")
	public ResponseEntity<?> deleteByAdmissionId(@PathVariable Long admissionId) {
		admissionService.deleteAdmission(admissionId);
		return new ResponseEntity<String>("Course Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/admissions")
	public ResponseEntity<?> createAdmission(@RequestBody Admission admission) {
		Long id = admissionService.createAdmission(admission);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/admissions/{admissionId}")
	public ResponseEntity<?> updateAdmission(@RequestBody Admission admission) {
		admission = admissionService.updateAdmission(admission);
		return new ResponseEntity<Admission>(admission, HttpStatus.OK);
	} 	
}