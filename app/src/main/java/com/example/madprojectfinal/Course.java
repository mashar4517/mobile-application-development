package com.example.madprojectfinal;

import com.orm.SugarRecord;

public class Course extends SugarRecord<Course> {
    String course;
    public Course(){

    }

    public Course(String course) {
        this.course = course;
    }
}
