package com.universitymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "professor_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long professorId;

	private String name;

	private String email;

	private String address;

	private Long phoneNumber;

	private String specialization;

	private String gender;

	private Long userId;

	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "courseId")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "department_id", referencedColumnName = "departmentId")
	private Department department;

	public Professor() {
		super();

	}

	public Professor(Long professorId, String name, String email, String address, Long phoneNumber, String department,
			String specialization, String gender) {
		super();
		this.professorId = professorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.specialization = specialization;
		this.gender = gender;
	}

	public Professor(Long professorId, String name, String email, String address, Long phoneNumber,
			String specialization, String gender, Long userId, Course course, Department department) {
		super();
		this.professorId = professorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.specialization = specialization;
		this.gender = gender;
		this.userId = userId;
		this.course = course;
		this.department = department;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", specialization=" + specialization + ", gender=" + gender
				+ ", userId=" + userId + ", course=" + course + ", department=" + department + "]";
	}

	
}
