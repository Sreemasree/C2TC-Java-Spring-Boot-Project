package com.tnsif.CourseService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CourseService.entity.Course;
import com.tnsif.CourseService.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//save the record
	
	public Course saveCourse(Course course)
	{
		return courseRepository.save(course);
	}
	
	//to retrieve all records
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	
	//to get specific record
	public Course getCourseById(Long id)
	{
		return courseRepository.findById(id).orElse(null);
	}
	
	//to update record
	public Course updateCourseById(Long id,Course course)
	{
		// to fetch existing record by id
		Course existingCourse = courseRepository.findById(id).orElse(null);
		
		//if course exists,update its files
		if(existingCourse != null) {
			existingCourse.setName(course.getName());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setInstructor(course.getInstructor());
			existingCourse.setPrice(course.getPrice());
			return courseRepository.save(existingCourse);
			}
		
		//if courese didn't exist return null
		return null;
	}
	
	//to delete record by id
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}

	
	
	

}
