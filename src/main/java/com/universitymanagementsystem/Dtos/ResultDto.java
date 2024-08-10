package com.universitymanagementsystem.Dtos;

import com.universitymanagementsystem.entity.Result;

public class ResultDto {

	private Long resultId;
	
	private Long gradeId;
	
	private Long studentId;

	private Long courseId;
	
	private Long enrollmentId;

	private Long departmentId;
	
	private Long userId;

	public ResultDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultDto(Long resultId, Long gradeId, Long studentId, Long courseId, Long enrollmentId, Long departmentId,
			Long userId) {
		super();
		this.resultId = resultId;
		this.gradeId = gradeId;
		this.studentId = studentId;
		this.courseId = courseId;
		this.enrollmentId = enrollmentId;
		this.departmentId = departmentId;
		this.userId = userId;
	}

	public Long getResultId() {
		return resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
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

	
	public Result getResult() {
		return new Result(resultId,null,null,null,null,null,userId);
	}
	@Override
	public String toString() {
		return "ResultDto [resultId=" + resultId + ", gradeId=" + gradeId + ", studentId=" + studentId + ", courseId="
				+ courseId + ", enrollmentId=" + enrollmentId + ", departmentId=" + departmentId + ", userId=" + userId
				+ "]";
	}
	
	

}
