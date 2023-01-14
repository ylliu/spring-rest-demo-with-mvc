package com.ylliu.spring.demo.rest;

import com.ylliu.spring.demo.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Mary", "Public"));
        students.add(new Student("John", "Doe"));
        students.add(new Student("Bonita", "Applebum"));
    }

    @RequestMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @RequestMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return students.get(studentId);
    }
}
