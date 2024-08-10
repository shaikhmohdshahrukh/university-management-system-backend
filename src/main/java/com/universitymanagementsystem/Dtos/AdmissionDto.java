package com.universitymanagementsystem.Dtos;

import java.time.LocalDate;

import com.universitymanagementsystem.entity.Admission;

public class AdmissionDto {

	private Long admissionId;
	
	private LocalDate admissionDate;

	private Long studentId;
	
	private Long courseId;
	
	private Long enrollmentId;
	
	private Long departmentId;
	
	private Long userId;
	
	public AdmissionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdmissionDto(Long admissionId, LocalDate admissionDate) {
		super();
		this.admissionId = admissionId;
		this.admissionDate = admissionDate;
	}
	
	public AdmissionDto(Long admissionId, LocalDate admissionDate, Long studentId, Long courseId, Long enrollmentId,
			Long departmentId, Long userId) {
		super();
		this.admissionId = admissionId;
		this.admissionDate = admissionDate;
		this.studentId = studentId;
		this.courseId = courseId;
		this.enrollmentId = enrollmentId;
		this.departmentId = departmentId;
		this.userId = userId;
	}
	

	public Long getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(Long admissionId) {
		this.admissionId = admissionId;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(Long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Admission getAdmission() {
		return new Admission(admissionId,admissionDate,null,null,null,null, userId);
	}

	@Override
	public String toString() {
		return "AdmissionDto [admissionId=" + admissionId + ", admissionDate=" + admissionDate + ", studentId="
				+ studentId + ", courseId=" + courseId + ", enrollmentId=" + enrollmentId + ", departmentId="
				+ departmentId + ", userId=" + userId + "]";
	}


	

}
