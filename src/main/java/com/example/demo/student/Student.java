package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student
{
    @Id
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;

    public Student()
    {

    }

    public Student(String name, String email, LocalDate dateOfBirth, Integer age)
    {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Student(Long id, String name, String email, LocalDate dateOfBirth, Integer age)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }
}
