package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universitymanagementsystem.entity.Enrollment;

public interface EnrollmentDao extends JpaRepository<Enrollment, Long> {

}
