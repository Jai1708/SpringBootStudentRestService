package com.jai.entities;

import org.springframework.stereotype.Component;
import lombok.Data;
import javax.persistence.*;

@Component
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;
    private String name;
    private int age;
    private String description;

    public Student() {
        super();
    }

    public Student(int studentId, String name, int age, String description) {
        this.id = studentId;
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
}
