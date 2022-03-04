package com.springrest.springrest.services;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.couseSQLConnetor.courseSqlc;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private courseSqlc coursesqlc;
	/*
	 * List<Course> list; public CourseServiceImpl() { list =new ArrayList<>();
	 * list.add(new Course(1,"APIC","This is API Connect  course")); list.add(new
	 * Course(2,"Data Power","This  is  a security featured course"));
	 * 
	 * }
	 */

	@Override
	public List<Course> getCourses() {
		
		//return list;
		return coursesqlc.findAll();
	}

	


	@Override
	public Course addCourse(Course course) {
		/*
		 * list.add(course); return course;
		 */
		coursesqlc.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		coursesqlc.save(course);
		return course;
		
	}

	@Override
	public void DeleteCourse(long courseId) {
		// TODO Auto-generated method stub;
		Course entity= coursesqlc.getById(courseId);
		coursesqlc.delete(entity);
	}




	@Override
	public Course getCourse(long id) {
		// TODO Auto-generated method stub
		
		  Optional<Course> object=coursesqlc.findById(id); 
		  return object.get();
		  
		  
		  }
		 
		
	

	


}
