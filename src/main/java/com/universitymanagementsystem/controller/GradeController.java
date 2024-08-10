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
import com.universitymanagementsystem.entity.Grade;
import com.universitymanagementsystem.service.GradeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/std")
public class GradeController {

	@Autowired
	protected GradeService gradeService;

	@GetMapping("/grades")
	public List<Grade> findAllGrade() {
		return gradeService.findAllGrade();
	}

	@GetMapping("/users/{userId}/grades")
	public Optional<Grade> findAllByUserId(@PathVariable Long userId) {
		return gradeService.findAllByUser(userId);
	}

	@GetMapping("/grades/{gradeId}")
	public ResponseEntity<?> findByGradeId(@PathVariable Long gradeId) {
		Optional<Grade> optionalGrade = gradeService.findGradeById(gradeId);
		if (optionalGrade.isPresent())
			return new ResponseEntity<Grade>(optionalGrade.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Grade Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/grades/{gradeId}")
	public ResponseEntity<?> deleteByGradeId(@PathVariable Long gradeId) {
		gradeService.deleteGrade(gradeId);
		return new ResponseEntity<String>("Grade Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/grades")
	public ResponseEntity<?> createGrade(@RequestBody Grade grade) {
		Long id = gradeService.createGrade(grade);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/grades/{gradeId}")
	public ResponseEntity<?> updateGrade(@RequestBody Grade grade) {
		grade= gradeService.updateGrade(grade);
		return new ResponseEntity<Grade>(grade, HttpStatus.OK);
	} 
	
	
}
