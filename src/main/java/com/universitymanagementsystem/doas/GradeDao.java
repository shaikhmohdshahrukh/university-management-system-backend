package com.universitymanagementsystem.doas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universitymanagementsystem.entity.Grade;

@Repository
public interface GradeDao extends JpaRepository<Grade, Long> {

}
