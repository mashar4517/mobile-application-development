package com.example.madprojectfinal;

import com.orm.SugarRecord;

public class Student extends SugarRecord<Student> {
    String rollNumber;
    String name;
    String marks;
    String remarks;
    String course;

    public Student(){

    }

    public Student(String rollNumber, String name,String marks, String remarks, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.remarks = remarks;
        this.course = course;
    }
}
