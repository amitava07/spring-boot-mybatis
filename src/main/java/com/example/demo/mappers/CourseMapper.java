package com.example.demo.mappers;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseMapper {
    Course findCourseById(Long courseId);
    List<Course> findAllCourses();

    List<Student> getAllStudents(Long courseId);
}
