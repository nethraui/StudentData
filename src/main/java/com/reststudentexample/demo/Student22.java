package com.reststudentexample.demo;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student22 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    //@Column(name = "firstname")
    private String firstName;
    //@Column(name = "lastname")
    private String lastName;
    //@Column(name = "year")
    private int year;

    public Student22(){

    }
    public Student22(Long studentId, String firstName, String lastName, int year) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
