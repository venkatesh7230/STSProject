package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
	public CourseServiceImpl() {
		list =new ArrayList<>();
		list.add(new Course(1,"APIC","This is API Connect  course"));
		list.add(new Course(2,"Data Power","This  is  a security feaatured course"));
		
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(int courseId) {
		Course c=null;
		for (Course course:list) {
			if(course.getId()==courseId) {
				c=course;
			}
		}
			return c;
		
 
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	

}
