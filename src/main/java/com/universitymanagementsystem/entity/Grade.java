package com.universitymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "grade_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long gradeId;
	
	private String gradeName;
	
	
	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "studentId")
	private Student student;


	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "courseId")
	private Course course;
	
	private Long userId;
	
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grade(Long gradeId, String gradeName) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
	}

	public Grade(Long gradeId, String gradeName, Student student, Course course, Long userId) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
		this.student = student;
		this.course = course;
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

	public void setGrade(String gradeName) {
		this.gradeName = gradeName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Grade [gradeId=" + gradeId + ", gradeName=" + gradeName + ", student=" + student + ", course=" + course
				+ ", userId=" + userId + "]";
	}

	
	
	

	
}
