package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImplementation implements CourseService{
	
//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImplementation() {}
	
	// Get All courses
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}
	
	// Get one course by id
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}
	
	// add course
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	// update course
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	// delete course by id
	public void deleteCourse(long courseId) {
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}
}
