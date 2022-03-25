package com.yash.service;

import java.util.List;

import com.yash.entity.Courses;

public interface CourseService {

	public List<Courses> getCourses();

	public Courses getCourse(long courseId);

	public Courses addCourse(Courses courses);

	public void deleteById(long courseId);

	public Courses UpdateCourse(Courses courses);
	
	
}
