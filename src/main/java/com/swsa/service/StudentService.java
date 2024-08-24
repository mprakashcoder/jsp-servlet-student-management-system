package com.swsa.service;
import com.swsa.model.Student;
import com.swsa.repository.StudentRepository;
import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public boolean insertStudent(Student student) throws SQLException {
        if (studentRepository.insertStudent(student)) {
            System.out.println("Student inserted successfully!");
        } else {
            System.out.println("Failed to insert Student.");
            return false;
        }
        return true;
    }

    public List<Student> retrieveStudents() throws SQLException {
        return studentRepository.retrieveStudents();
    }
}