package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.CourseDao;
import com.yash.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
	}

	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Courses getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses courses) {
		courseDao.save(courses);
		return courses;
	}

	@Override
	public void deleteById(long courseId) {
		courseDao.deleteById(courseId);
	
	}
	
	
	public Courses UpdateCourse(Courses courses) {
		courseDao.save(courses);
		return courses;
		
	}

}
