package com.boraji.tutorial.springboot.service;

import com.boraji.tutorial.springboot.dao.postgresql.BookRepository;
import com.boraji.tutorial.springboot.dao.postgresql.CourseRepository;
import com.boraji.tutorial.springboot.entity.postgresql.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private BookRepository bookRepository;

    public Course getAllCourse(Long bookId){
        return courseRepository.findOne(bookId);
    }

    public Object[] getCourse(Long bookId, Long courseId)
    {
        ArrayList book = new ArrayList<>();
        book.add(bookRepository.findOne(bookId));
        return book.toArray();
    }

    public void addCourse(Course course)
    {
        courseRepository.save(course);
    }

    public void updateCourse(Long id, Course course)
    {
        courseRepository.save(course);
    }

    public void deleteCourse(Long id)
    {
        courseRepository.delete(id);
    }
}
