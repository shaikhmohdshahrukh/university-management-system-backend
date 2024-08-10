package com.universitymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "result_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long resultId;
	
	@ManyToOne
	@JoinColumn(name = "grade_id", referencedColumnName = "gradeId")
	private Grade grade;
	
	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "studentId")
	private Student student;


	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "courseId")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "enrollment_id", referencedColumnName = "enrollmentId")
	private Enrollment enrollment;


	@ManyToOne
	@JoinColumn(name = "department_id", referencedColumnName = "departmentId")
	private Department department;
	
	private Long userId;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Result(Long resultId) {
	super();
	this.resultId = resultId;
}


	public Result(Long resultId, Grade grade, Student student, Course course, Enrollment enrollment,
			Department department, Long userId) {
		super();
		this.resultId = resultId;
		this.grade = grade;
		this.student = student;
		this.course = course;
		this.enrollment = enrollment;
		this.department = department;
		this.userId = userId;
	}

	public Long getResultId() {
		return resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
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

	public Enrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", grade=" + grade + ", student=" + student + ", course=" + course
				+ ", enrollment=" + enrollment + ", department=" + department + ", userId=" + userId + "]";
	}
	
	

}
