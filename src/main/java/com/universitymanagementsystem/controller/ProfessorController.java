package com.universitymanagementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.universitymanagementsystem.entity.Professor;
import com.universitymanagementsystem.service.ProfessorService;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/professor")
@RestController
public class ProfessorController {

	@Autowired
    protected ProfessorService professorService;
	
	@GetMapping("/professors")
	public List<Professor> findAllProfessor() {
		return professorService.findAllProfessors();
	}

	@GetMapping("/users/{userId}/professors")
	public Optional<Professor> findAllByUserId(@PathVariable Long userId) {
		return professorService.findAllByUser(userId);
	}

	@GetMapping("/professors/{professorId}")
	public ResponseEntity<?> findByProfessorId(@PathVariable Long professorId) {
		Optional<Professor> optionalProfessor = professorService.findProfessorById(professorId);
		if (optionalProfessor.isPresent())
			return new ResponseEntity<Professor>(optionalProfessor.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Professor Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/professors/{professorId}")
	public ResponseEntity<?> deleteByProfessorId(@PathVariable Long professorId) {
		professorService.deleteProfessor(professorId);
		return new ResponseEntity<String>("Professor Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/professors")
	public ResponseEntity<?> createProfessor(@RequestBody Professor professor) {
		Long id = professorService.createProfessor(professor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/professors/{professorId}")
	public ResponseEntity<?> updateProfessor(@RequestBody Professor professor) {
		professor = professorService.updateProfessor(professor);
		return new ResponseEntity<Professor>(professor, HttpStatus.OK);
	} 
}
