package com.universitymanagementsystem.service;

import org.springframework.stereotype.Service;
import com.universitymanagementsystem.doas.CourseDao;
import com.universitymanagementsystem.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

	@Autowired
    protected CourseDao courseRepository;

	public Long createCourse(Course course) {
		course = courseRepository.save(course);
		return course.getCourseId();
	}

	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	public void deleteCourse(Long courseId) {
		courseRepository.deleteById(courseId);
	}

	public Optional<Course> findCourseById(Long courseId) {
		return courseRepository.findById(courseId);
	}

	public List<Course> findAllCourses() {
		return courseRepository.findAll();
	}

	public Optional<Course> findAllByUser(Long userId) {
		return courseRepository.findById(userId);
	}
}
