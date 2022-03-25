package com.yash.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entity.Courses;

public interface CourseDao extends JpaRepository<Courses, Long>{

	
}
