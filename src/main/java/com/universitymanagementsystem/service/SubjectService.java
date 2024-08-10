package com.universitymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universitymanagementsystem.doas.StudentDao;
import com.universitymanagementsystem.doas.SubjectDao;
import com.universitymanagementsystem.entity.Student;
import com.universitymanagementsystem.entity.Subject;

@Service
public class SubjectService {


	@Autowired
	protected SubjectDao subjectRepository;

	public Long createSubject(Subject subject) {
		subject = subjectRepository.save(subject);
		return subject.getSubjectId();
	}

	public Subject updateSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	public void deleteSubject(Long subjectId) {
		subjectRepository.deleteById(subjectId);
	}

	public Optional<Subject> findSubjectById(Long subjectId) {
		return subjectRepository.findById(subjectId);
	}

	public List<Subject> findAllSubject() {
		return subjectRepository.findAll();
	}

	public Optional<Subject> findAllByUser(Long userId) {
		return subjectRepository.findById(userId);
	}
}
