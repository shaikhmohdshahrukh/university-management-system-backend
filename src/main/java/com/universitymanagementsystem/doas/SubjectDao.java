package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universitymanagementsystem.entity.Subject;

public interface SubjectDao extends JpaRepository<Subject, Long> {

}
