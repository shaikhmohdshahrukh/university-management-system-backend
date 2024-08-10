package com.universitymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universitymanagementsystem.doas.GradeDao;
import com.universitymanagementsystem.entity.Grade;

@Service
public class GradeService {

	@Autowired
    protected GradeDao gradeRepository;

	public Long createGrade(Grade grade) {
		grade = gradeRepository.save(grade);
		return grade.getGradeId();
	}

	public Grade updateGrade(Grade grade) {
		return gradeRepository.save(grade);
	}

	public void deleteGrade(Long gradeId) {
		gradeRepository.deleteById(gradeId);
	}

	public Optional<Grade> findGradeById(Long gradeId) {
		return gradeRepository.findById(gradeId);
	}

	public List<Grade> findAllGrade() {
		return gradeRepository.findAll();
	}

	public Optional<Grade> findAllByUser(Long userId) {
		return gradeRepository.findById(userId);
	}
}
