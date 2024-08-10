package com.universitymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universitymanagementsystem.doas.AdmissionDao;

import com.universitymanagementsystem.entity.Admission;

@Service
public class AdmissionService {
	
	@Autowired	
	protected AdmissionDao admissionRepository;

	public Long createAdmission(Admission admission) {
		admission = admissionRepository.save(admission);
		return admission.getAdmissionId();
	}

	public Admission updateAdmission(Admission admission) {
		return admissionRepository.save(admission);
	}

	public void deleteAdmission(Long admissionId) {
		admissionRepository.deleteById(admissionId);
	}

	public Optional<Admission> findAdmissionById(Long admissionId) {
		return admissionRepository.findById(admissionId);
	}

	public List<Admission> findAllAdmission() {
		return admissionRepository.findAll();
	}

	public Optional<Admission> findAllByUser(Long userId) {
		return admissionRepository.findById(userId);
	}
}