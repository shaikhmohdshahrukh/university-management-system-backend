package com.universitymanagementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.universitymanagementsystem.entity.Course;
import com.universitymanagementsystem.service.CourseService;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/course")
@RestController
public class CourseController {

	@Autowired
    protected CourseService courseService;

	@GetMapping("/courses")
	public List<Course> findAllCourses() {
		return courseService.findAllCourses();
	}

	@GetMapping("/users/{userId}/courses")
	public Optional<Course> findAllByUserId(@PathVariable Long userId) {
		return courseService.findAllByUser(userId);
	}

	@GetMapping("/courses/{courseId}")
	public ResponseEntity<?> findByCourseId(@PathVariable Long courseId) {
		Optional<Course> optionalCourse = courseService.findCourseById(courseId);
		if (optionalCourse.isPresent())
			return new ResponseEntity<Course>(optionalCourse.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Course Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<?> deleteByCourseId(@PathVariable Long courseId) {
		courseService.deleteCourse(courseId);
		return new ResponseEntity<String>("Course Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping("/courses")
	public ResponseEntity<?> createCourse(@RequestBody Course course) {
		Long id = courseService.createCourse(course);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/courses/{courseId}")
	public ResponseEntity<?> updateCourse(@RequestBody Course course) {
		course = courseService.updateCourse(course);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	} 
}
