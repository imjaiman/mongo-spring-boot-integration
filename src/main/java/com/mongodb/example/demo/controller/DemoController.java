package com.mongodb.example.demo.controller;

import com.mongodb.example.demo.model.Student;
import com.mongodb.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * @author Rahul Jaiman
 * @date 2022-03-03 2:31 AM
 */
@RestController
@RequestMapping("/school")
public class DemoController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add-student")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student student1 = studentRepository.save(student);
        return ResponseEntity.ok(student1);
    }

    @GetMapping("/students")
    public ResponseEntity<?> getStudents(){
        return ResponseEntity.ok(studentRepository.findAll());
    }

}
