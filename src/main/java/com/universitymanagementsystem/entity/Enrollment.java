package com.universitymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Enrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "enrollments_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long enrollmentId;

	private String enrollmentNo;

	private Long userId;

	public Enrollment() {
	}

	public Enrollment(Long enrollmentId, String enrollmentNo) {
		super();
		this.enrollmentId = enrollmentId;
		this.enrollmentNo = enrollmentNo;
	}

	public Enrollment(Long enrollmentId, String enrollmentNo, Long userId) {
		super();
		this.enrollmentId = enrollmentId;
		this.enrollmentNo = enrollmentNo;
		this.userId = userId;
	}

	public Long getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(Long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", enrollmentNo=" + enrollmentNo + ", userId=" + userId + "]";
	}

}
