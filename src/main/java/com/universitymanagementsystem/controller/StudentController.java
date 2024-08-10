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
import com.universitymanagementsystem.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/std")
public class StudentController {

	@Autowired
	protected StudentService studentService;

	@GetMapping("/students")
	public List<Student> findAllStudents() {
		return studentService.findAllStudents();
	}

	@GetMapping("/users/{userId}/students")
	public Optional<Student> findAllByUserId(@PathVariable Long userId) {
		return studentService.findAllByUser(userId);
	}

	@GetMapping("/students/{studentId}")
	public ResponseEntity<?> findByStudentId(@PathVariable Long studentId) {
		Optional<Student> optionalStudent = studentService.findStudentById(studentId);
		if (optionalStudent.isPresent())
			return new ResponseEntity<Student>(optionalStudent.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Student Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<?> deleteByStudentId(@PathVariable Long studentId) {
		studentService.deleteStudent(studentId);
		return new ResponseEntity<String>("Student Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/students")
	public ResponseEntity<?> createStudent(@RequestBody Student student) {
		Long id = studentService.createStudent(student);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/students/{studentId}")
	public ResponseEntity<?> updateStudent(@RequestBody Student student) {
		student = studentService.updateStudent(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	} 
	
	
}
