package com.example.madprojectfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class ViewAll extends AppCompatActivity {

    ListView list_course_viewall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);
        list_course_viewall = (ListView) findViewById(R.id.list_course_viewall);
        CourseAdapter adapter = new CourseAdapter(this,this , getData());
        list_course_viewall.setAdapter(adapter);

    }
    List<Course> getData(){
        List<Course> courseList = Course.listAll(Course.class);
        return courseList;
    }
}
