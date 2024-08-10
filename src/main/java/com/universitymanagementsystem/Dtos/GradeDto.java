package com.universitymanagementsystem.Dtos;

import com.universitymanagementsystem.entity.Grade;

public class GradeDto {

	private Long gradeId;
	
	private String gradeName;

	private Long studentId;

	private Long courseId;	
	
	private Long userId;
	
	public GradeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradeDto(Long gradeId, String gradeName) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
	}

	public GradeDto(Long gradeId, String gradeName, Long studentId, Long courseId, Long userId) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
		this.studentId = studentId;
		this.courseId = courseId;
		this.userId = userId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Grade getGrade() {
		
		return new Grade(gradeId, gradeName,null, null, userId);
	}
	@Override
	public String toString() {
		return "GradeDto [gradeId=" + gradeId + ", gradeName=" + gradeName + ", studentId=" + studentId + ", courseId="
				+ courseId + ", userId=" + userId + "]";
	}

	
	
}
