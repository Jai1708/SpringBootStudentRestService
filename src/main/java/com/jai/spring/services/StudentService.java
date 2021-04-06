package com.jai.spring.services;

import com.jai.entities.Student;

import java.util.List;

public interface StudentService {

    void create(Student student);

    void edit(Student student);

    void remove(Student student);

    Student findByStudentId(int id);

    List<Student> findAllStudents();

}
