package com.universitymanagementsystem.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "student_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long studentId;

	private String name;

	private String email;

	private String address;

	private String phoneNumber;

	private String birthday;

	private Date date;

	private String gender;

	private Long userId;

	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "courseId")
	private Course course;

	public Student() {
		super();
	}

	public Student(Long studentId, String name, String email, String address, String phoneNumber, String birthday,
			Date date, String gender) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.date = date;
		this.gender = gender;
	}

	public Student(Long studentId, String name, String email, String address, String phoneNumber, String birthday,
			Date date, String gender, Long userId, Course course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.date = date;
		this.gender = gender;
		this.userId = userId;
		this.course = course;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + ", date=" + date + ", gender=" + gender
				+ ", userId=" + userId + ", course=" + course + "]";
	}

}
