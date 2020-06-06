package com.example.madprojectfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class StudentList extends AppCompatActivity {

    ListView list_all_students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        list_all_students = (ListView) findViewById(R.id.list_all_students);
        StudentAdapter adapter = new StudentAdapter(this,this , getData());
        list_all_students.setAdapter(adapter);

    }
    List<Student> getData(){
        List<Student> studentList = Student.listAll(Student.class);
        return studentList;
    }
}
