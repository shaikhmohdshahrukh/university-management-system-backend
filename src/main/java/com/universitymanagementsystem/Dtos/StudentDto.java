package com.universitymanagementsystem.Dtos;

import java.util.Date;
import com.universitymanagementsystem.entity.Student;

public class StudentDto {

	private Long studentId;

	private String name;

	private String email;

	private String address;

	private String phoneNumber;

	private String birthday;

	private Date date;

	private String gender;

	private Long userId;

	private Long courseId;

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDto(Long studentId, String name, String email, String address, String phoneNumber, String birthday,
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

	public StudentDto(Long studentId, String name, String email, String address, String phoneNumber, String birthday,
			Date date, String gender, Long userId, Long courseId) {
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
		this.courseId = courseId;
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

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	
	public Student getStudent() {
		return new Student(studentId, name, email, address, phoneNumber, birthday, date, gender, userId, null);
	}

	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + ", date=" + date + ", gender=" + gender
				+ ", userId=" + userId + ", courseId=" + courseId + "]";
	}

}
