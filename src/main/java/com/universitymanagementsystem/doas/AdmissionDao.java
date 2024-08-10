package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universitymanagementsystem.entity.Admission;

public interface AdmissionDao extends JpaRepository<Admission, Long> {

}
