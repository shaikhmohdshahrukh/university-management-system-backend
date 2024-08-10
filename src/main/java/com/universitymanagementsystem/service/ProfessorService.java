package com.universitymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universitymanagementsystem.doas.ProfessorDao;
import com.universitymanagementsystem.entity.Professor;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
	
	@Autowired
    protected ProfessorDao professorRepository;
	
	public Long createProfessor(Professor professor) {
		professor = professorRepository.save(professor);
		return professor.getProfessorId();
	}

	public Professor updateProfessor(Professor professor) {
		return professorRepository.save(professor);
	}

	public void deleteProfessor(Long professorId) {
		professorRepository.deleteById(professorId);
	}

	public Optional<Professor> findProfessorById(Long professorId) {
		return professorRepository.findById(professorId);
	}

	public List<Professor> findAllProfessors() {
		return professorRepository.findAll();
	}

	public Optional<Professor> findAllByUser(Long userId) {
		return professorRepository.findById(userId);
	}
}

