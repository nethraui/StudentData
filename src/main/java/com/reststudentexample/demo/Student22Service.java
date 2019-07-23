package com.reststudentexample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student22Service {

    @Autowired
    Student22Repository student22Repository;
    public void save(Student22 student) {
        student22Repository.save(student);
    }

    public List<Student22> listAll() {
        return (List<Student22>) student22Repository.findAll();
    }
}
