package com.universitymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universitymanagementsystem.doas.DepartmentDao;
import com.universitymanagementsystem.entity.Department;

@Service
public class DepartmentService {

	@Autowired
    protected DepartmentDao departmentRepository;

	public Long createDepartmen(Department department) {
		department = departmentRepository.save(department);
		return department.getDepartmentId();
	}

	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public void deleteDepartment (Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}

	public Optional<Department > findDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId);
	}

	public List<Department > findAllDepartment () {
		return departmentRepository.findAll();
	}

	public Optional<Department > findAllByUser(Long userId) {
		return departmentRepository.findById(userId);
	}
}
