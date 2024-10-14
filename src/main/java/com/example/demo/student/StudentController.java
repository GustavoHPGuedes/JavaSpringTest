package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "demo/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){

        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){

        studentService.addNewStudent(student);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){

        studentService.addNewStudent(student);
    }

    @GetMapping(value = "email/{userEmail}")
    public List<Student> getByEmail(@PathVariable(value = "userEmail", required = true) String userEmail){

        return studentService.findByEmail(userEmail);
    }
}
