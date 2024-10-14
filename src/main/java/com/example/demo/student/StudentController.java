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

    @GetMapping(value = "email/{userEmail}")
    public List<Student> getByEmail(@PathVariable(value = "userEmail", required = true) String userEmail){

        return studentService.findStudentsByEmail(userEmail);
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){

        studentService.addOrSaveStudent(student);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){

        studentService.addOrSaveStudent(student);
    }

    @DeleteMapping(value = "{id}")
    public void deleteStudent(@PathVariable(value = "id", required = true) Long id){

        studentService.deleteStudent(id);
    }
}
