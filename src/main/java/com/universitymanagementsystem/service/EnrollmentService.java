package com.universitymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universitymanagementsystem.doas.EnrollmentDao;
import com.universitymanagementsystem.entity.Enrollment;

@Service
public class EnrollmentService {

	@Autowired
    protected EnrollmentDao enrollmentRepository;

	public Long createEnrollment(Enrollment enrollment) {
		enrollment = enrollmentRepository.save(enrollment);
		return enrollment.getEnrollmentId();
	}

	public Enrollment updateEnrollment(Enrollment enrollment) {
		return enrollmentRepository.save(enrollment);
	}

	public void deleteEnrollment(Long enrollmentId) {
		enrollmentRepository.deleteById(enrollmentId);
	}

	public Optional<Enrollment> findEnrollmentdById(Long enrollmentId) {
		return enrollmentRepository.findById(enrollmentId);
	}

	public List<Enrollment> findAllEnrollment() {
		return enrollmentRepository.findAll();
	}

	public Optional<Enrollment> findAllByUser(Long enrollmentId) {
		return enrollmentRepository.findById(enrollmentId);
	}
}
