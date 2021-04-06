package com.jai.spring.services;

import com.jai.entities.Student;
import com.jai.spring.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void create(Student student) {
        // TODO Auto-generated method stub
        studentDao.save(student);

    }

    @Override
    public void edit(Student student) {
        // TODO Auto-generated method stub
        studentDao.save(student);

    }

    @Override
    public void remove(Student student) {
        // TODO Auto-generated method stub
        studentDao.delete(student);
    }

    @Override
    public Student findByStudentId(int id) {
        // TODO Auto-generated method stub
        Optional<Student> optionalStudent = studentDao.findById(id);
        return optionalStudent.get();
    }

    @Override
    public List<Student> findAllStudents() {
        // TODO Auto-generated method stub
        List<Student> students = studentDao.findAll();
        return students;
    }
}
