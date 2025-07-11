package com.tnsif.StudentService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.StudentService.entity.Student;
import com.tnsif.StudentService.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save the record
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Retrieve all records
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get specific record by ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Update record by ID
    public Student updateStudentById(Long id, Student student) {
        // Fetch existing record by ID
        Student existingStudent = studentRepository.findById(id).orElse(null);

        // If student exists, update its fields
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setCourse(student.getCourse());
            existingStudent.setFees(student.getFees());
            return studentRepository.save(existingStudent);
        }

        // If student doesn't exist, return null
        return null;
    }

    // Delete record by ID
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
