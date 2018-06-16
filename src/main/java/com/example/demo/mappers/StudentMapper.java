package com.example.demo.mappers;

import com.example.demo.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {
    void insertStudent(Student student);
    Student findStudentById(Long studentId);
    List<Student> findAllStudents();
}
