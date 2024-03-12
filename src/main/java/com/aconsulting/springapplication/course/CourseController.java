package com.aconsulting.springapplication.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourseDetails(@PathVariable int id) {
		 Optional<Course> course = courseRepository.findById(id);
		if(course.isEmpty()) {
			throw new RuntimeException("Course is not found");
		}
		return course.get();
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		courseRepository.save(course);
	}
	
	@PutMapping("/courses/{id}")
	public void update(@PathVariable int id, @RequestBody Course course) {
	courseRepository.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourses(@PathVariable int id) {
		courseRepository.deleteById(id);
	}
}
