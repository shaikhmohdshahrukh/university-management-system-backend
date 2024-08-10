package com.universitymanagementsystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universitymanagementsystem.doas.StudentDao;
import com.universitymanagementsystem.entity.Student;

@Service
public class StudentService {
	

	@Autowired
	protected StudentDao studentRepository;

	public Long createStudent(Student student) {
		student = studentRepository.save(student);
		return student.getStudentId();
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudent(Long studentId) {
		studentRepository.deleteById(studentId);
	}

	public Optional<Student> findStudentById(Long studentId) {
		return studentRepository.findById(studentId);
	}

	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	public Optional<Student> findAllByUser(Long userId) {
		return studentRepository.findById(userId);
	}
}
