package com.jac.fsd.demo.controller;

import com.jac.fsd.demo.entity.Student;
import com.jac.fsd.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        this.studentRepository.save(student);
    }

    @GetMapping("/student")
    public List<Student> getStudents(){
        return this.studentRepository.findAll();
    }


}
