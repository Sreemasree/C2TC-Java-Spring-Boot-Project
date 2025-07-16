package com.tnsif.CourseService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.CourseService.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
