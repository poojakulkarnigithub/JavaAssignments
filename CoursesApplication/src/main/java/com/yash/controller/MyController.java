package com.yash.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Courses;
import com.yash.service.CourseService;

@RestController
@CrossOrigin
public class MyController {
	
	@Autowired
	private CourseService courseService;
	

	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		return courseService.addCourse(courses);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public void addCourse(@PathVariable String courseId) {
		courseService.deleteById(Long.parseLong(courseId));
	}
	
	@PutMapping("/courses")
	public Courses UpdateCourse(@RequestBody Courses courses) {
		System.out.println("update course");
		return courseService.UpdateCourse(courses);
	}
}
