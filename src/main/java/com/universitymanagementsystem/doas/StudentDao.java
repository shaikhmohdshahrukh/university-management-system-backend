package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universitymanagementsystem.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>{

}
