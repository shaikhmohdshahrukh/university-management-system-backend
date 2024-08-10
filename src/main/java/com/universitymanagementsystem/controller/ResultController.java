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
import com.universitymanagementsystem.entity.Result;
import com.universitymanagementsystem.service.ResultService;


@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/course")
@RestController
public class ResultController {

	@Autowired
    protected ResultService resultService;

	@GetMapping("/results")
	public List<Result> findAllResult() {
		return resultService.findAllResult();
	}

	@GetMapping("/users/{userId}/results")
	public Optional<Result> findAllByUserId(@PathVariable Long userId) {
		return resultService.findAllByUser(userId);
	}

	@GetMapping("/results/{resultId}")
	public ResponseEntity<?> findByResultId(@PathVariable Long resultId) {
		Optional<Result> optionalResult = resultService.findResultById(resultId);
		if (optionalResult.isPresent())
			return new ResponseEntity<Result>(optionalResult.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Result Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/results/{resultId}")
	public ResponseEntity<?> deleteByResultId(@PathVariable Long resultId) {
		resultService.deleteResult(resultId);
		return new ResponseEntity<String>("Result Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/results")
	public ResponseEntity<?> createResult(@RequestBody Result result) {
		Long id = resultService.createResult(result);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/results/{resultId}")
	public ResponseEntity<?> updateResult(@RequestBody Result result) {
		result = resultService.updateResult(result);
		return new ResponseEntity<Result>(result, HttpStatus.OK);
	} 
}
