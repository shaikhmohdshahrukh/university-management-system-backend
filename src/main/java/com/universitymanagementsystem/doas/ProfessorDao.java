package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universitymanagementsystem.entity.Professor;

@Repository
public interface ProfessorDao extends JpaRepository<Professor, Long> {

}
