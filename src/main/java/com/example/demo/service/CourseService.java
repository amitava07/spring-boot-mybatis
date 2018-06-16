package com.example.demo.service;

import com.example.demo.mappers.CourseMapper;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseMapper courseMapper;

    public CourseService(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    public Course getCourse(Long courseId) {
        return courseMapper.findCourseById(courseId);
    }

    public List<Course> getAllCourses() {
        return courseMapper.findAllCourses();
    }

    public List<Student> getAllStudents(Long courseId) {
        return courseMapper.getAllStudents(courseId);
    }
}
