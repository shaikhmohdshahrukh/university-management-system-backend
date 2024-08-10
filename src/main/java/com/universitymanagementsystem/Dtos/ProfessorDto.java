package com.universitymanagementsystem.Dtos;

import com.universitymanagementsystem.entity.Professor;

public class ProfessorDto {

	private Long professorId;

	private String name;

	private String email;

	private String address;

	private Long phoneNumber;

	private String specialization;

	private String gender;

	private Long userId;

	private Long courseId;
	
	private Long departmentId;

	public ProfessorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessorDto(Long professorId, String name, String email, String address, Long phoneNumber,
			String department, String specialization, String gender) {
		super();
		this.professorId = professorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.specialization = specialization;
		this.gender = gender;
	}

	

	public ProfessorDto(Long professorId, String name, String email, String address, Long phoneNumber,
			String specialization, String gender, Long userId, Long courseId, Long departmentId) {
		super();
		this.professorId = professorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.specialization = specialization;
		this.gender = gender;
		this.userId = userId;
		this.courseId = courseId;
		this.departmentId = departmentId;
	}

	
	public Long getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Long professorId) {
		this.professorId = professorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Professor getProfessor() {
		return new Professor(professorId, name, email,address,phoneNumber,specialization,gender, userId, null,null);
	}

	@Override
	public String toString() {
		return "ProfessorDto [professorId=" + professorId + ", name=" + name + ", email=" + email + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", specialization=" + specialization + ", gender=" + gender
				+ ", userId=" + userId + ", courseId=" + courseId + ", departmentId=" + departmentId + "]";
	}

	
	

}
