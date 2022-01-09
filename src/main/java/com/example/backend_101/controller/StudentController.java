package com.example.backend_101.controller;

import com.example.backend_101.model.Student;
import com.example.backend_101.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired // dependency injection
    private StudentService studentService;

    @GetMapping(value = "hello-world")
    public String helloWorldController() {
        // call service
        return "Hello World";
    }

    @GetMapping(value = "json-example")
    public Integer jsonExampleController() {
        return 345;
    }

    @PostMapping(value = "add-student")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping(value = "student")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
    
}
