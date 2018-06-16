package com.example.demo.service;

import com.example.demo.mappers.StudentMapper;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public List<Student> getAllStudents() {
        return studentMapper.findAllStudents();
    }

    public Student getStudent(Long studentId) {
        return studentMapper.findStudentById(studentId);
    }

    public void createStudent(Student student) {
        studentMapper.insertStudent(student);
    }
}
