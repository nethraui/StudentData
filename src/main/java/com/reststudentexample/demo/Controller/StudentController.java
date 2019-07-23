package com.reststudentexample.demo.Controller;

import com.reststudentexample.demo.Student22;
import com.reststudentexample.demo.Student22Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    Student22Service student22Service;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Student22 save(@RequestBody Student22 account){
        student22Service.save(account);
        return account;
    }

    @GetMapping("/")
    public List<Student22> getAllStudent(){
        return student22Service.listAll();
    }
}
