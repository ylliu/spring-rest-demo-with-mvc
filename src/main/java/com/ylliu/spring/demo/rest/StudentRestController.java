package com.ylliu.spring.demo.rest;

import com.ylliu.spring.demo.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @RequestMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Mary", "Public"));
        theStudents.add(new Student("John", "Doe"));
        theStudents.add(new Student("Bonita", "Applebum"));
        return theStudents;
    }
}
