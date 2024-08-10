package com.universitymanagementsystem.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "course_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long courseId;

	private String courseName;

	private String courseCode;

	private String description;
	
	private Long departmentId;

	private Long userId;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long courseId, String courseName, String courseCode, String description, Long departmentId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.description = description;
		this.departmentId = departmentId;
	}

	public Course(Long courseId, String courseName, String courseCode, String description, Long departmentId,
			Long userId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.description = description;
		this.departmentId = departmentId;
		this.userId = userId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseCode=" + courseCode
				+ ", description=" + description + ", departmentId=" + departmentId + ", userId=" + userId + "]";
	} 

	

	
	


}
