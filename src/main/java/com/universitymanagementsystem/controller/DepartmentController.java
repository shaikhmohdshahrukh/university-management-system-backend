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
import com.universitymanagementsystem.entity.Department;
import com.universitymanagementsystem.service.DepartmentService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DepartmentController {

		@Autowired
		protected DepartmentService departmentService;

		@GetMapping("/departments")
		public List<Department> findAllDepartment() {
			return departmentService.findAllDepartment();
		}

		@GetMapping("/users/{userId}/departments")
		public Optional<Department> findAllByUserId(@PathVariable Long userId) {
			return departmentService.findAllByUser(userId);
		}

		@GetMapping("/departments/{departmentId}")
		public ResponseEntity<?> findByDepartmentId(@PathVariable Long departmentId) {
			Optional<Department> optionalDepartment = departmentService.findDepartmentById(departmentId);
			if (optionalDepartment.isPresent())
				return new ResponseEntity<Department>(optionalDepartment.get(), HttpStatus.OK);
			else
				return new ResponseEntity<String>("Department Not Found", HttpStatus.NOT_FOUND);
		}

		@DeleteMapping("/departments/{departmentId}")
		public ResponseEntity<?> deleteByDepartmentId(@PathVariable Long departmentId) {
			departmentService.deleteDepartment(departmentId);
			return new ResponseEntity<String>("Department Deleted Successfully", HttpStatus.NO_CONTENT);
		}

		@PostMapping("/departments")
		public ResponseEntity<?> createDepartment(@RequestBody Department department) {
			Long id = departmentService.createDepartmen(department);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}

		@PutMapping("/departments/{departmentId}")
		public ResponseEntity<?> updateDepartment(@RequestBody Department department) {
			department= departmentService.updateDepartment(department);
			return new ResponseEntity<Department>(department, HttpStatus.OK);
		} 
		
}
