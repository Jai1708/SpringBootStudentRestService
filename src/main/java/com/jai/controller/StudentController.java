package com.jai.controller;

import com.jai.entities.Student;
import com.jai.spring.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.findByStudentId(id);
    }

    @PostMapping
    public String createStudent(@RequestBody Student student) {
        studentService.create(student);
        return "Student created successfully.";
    }

    @PutMapping
    public String editStudent(@RequestBody Student student) {
        studentService.edit(student);
        return "Employee edited successfully.";
    }

    @DeleteMapping
    public String removeStudent(@RequestBody Student student) {
        studentService.remove(student);
        return "Student deleted successfully.";
    }

}
