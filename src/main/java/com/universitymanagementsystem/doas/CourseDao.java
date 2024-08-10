package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universitymanagementsystem.entity.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {

}
