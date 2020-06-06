package com.example.madprojectfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class SelectCourse extends AppCompatActivity {
    ListView list_courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectcourses);
        list_courses = (ListView) findViewById(R.id.list_courses);
        CourseAdapter adapter = new CourseAdapter(this,this , getData());
        list_courses.setAdapter(adapter);

    }
    List<Course> getData(){
        List<Course> courseList = Course.listAll(Course.class);
        return courseList;
    }

}
