package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    public List<Student> findStudentsByEmail(String email){

        return studentRepository.findStudentsByEmail(email);
    }

    public void addOrSaveStudent(Student student){

        Optional<Student> studentByEmail = studentRepository.checkStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()){
            throw  new IllegalStateException("Email taken.");
        }

        studentRepository.save(student);
    }



    public void deleteStudent(Long id){

        studentRepository.deleteById(id);
    }
}
