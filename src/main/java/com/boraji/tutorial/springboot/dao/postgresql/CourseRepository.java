package com.boraji.tutorial.springboot.dao.postgresql;

import com.boraji.tutorial.springboot.entity.postgresql.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Long> {
}