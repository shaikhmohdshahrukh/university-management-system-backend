package com.universitymanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Admission {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "admission_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long admissionId;
	
    private LocalDate admissionDate;
 

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
 
    public Admission() {
    }

    public Admission(Long admissionId, LocalDate admissionDate) {
    	super();
    	this.admissionId = admissionId;
    	this.admissionDate = admissionDate;
    }

	public Admission(Long admissionId, LocalDate admissionDate, Student student, Course course, Enrollment enrollment,
			Department department, Long userId) {
		super();
		this.admissionId = admissionId;
		this.admissionDate = admissionDate;
		this.student = student;
		this.course = course;
		this.enrollment = enrollment;
		this.department = department;
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
		return "Admission [admissionId=" + admissionId + ", admissionDate=" + admissionDate + ", student=" + student
				+ ", course=" + course + ", enrollment=" + enrollment + ", department=" + department + ", userId="
				+ userId + "]";
	}
    
}
