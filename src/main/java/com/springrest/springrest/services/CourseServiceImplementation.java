package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImplementation implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImplementation() {
		list = new ArrayList<>();
		list.add(new Course(14, "Java Course", "It is a full advanced java course @756 INR"));
		list.add(new Course(15, "Javascript Course", "It is a full advanced java course @756 INR"));
		list.add(new Course(16, "Python Course", "It is a full advanced java course @756 INR"));
		list.add(new Course(17, "Spring Boot Course", "It is a full advanced java course @756 INR"));
	}
	
	// Get All courses
	@Override
	public List<Course> getCourses() {
		return list;
	}
	
	// Get one course by id
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course: list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	
	// add course
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
}
