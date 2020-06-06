package com.example.madprojectfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ViewMarks extends AppCompatActivity {
    Button btn_view_search;
    TextView txt_viewmarks_rollno;
    TextView txt_viewmarks_name;
    TextView txt_viewmarks_course;
    TextView txt_viewmarks_marks;
    TextView txt_viewmarks_remarks;
    EditText ed_view_rollno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_marks);
        txt_viewmarks_rollno = (TextView) findViewById(R.id.txt_viewmarks_rollno);
        txt_viewmarks_name = (TextView) findViewById(R.id.txt_viewmarks_name);
        txt_viewmarks_course = (TextView) findViewById(R.id.txt_viewmarks_course);
        txt_viewmarks_marks = (TextView) findViewById(R.id.txt_viewmarks_marks);
        txt_viewmarks_remarks = (TextView) findViewById(R.id.txt_viewmarks_remarks);
        ed_view_rollno = (EditText) findViewById(R.id.ed_view_rollno);
        btn_view_search = (Button) findViewById(R.id.btn_view_search);
        btn_view_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Student> studentList = Student.find(Student.class, "roll_number = ?", ed_view_rollno.getText().toString());
                if(studentList.size()>0) {
                    Student student = studentList.get(0);
                    txt_viewmarks_rollno.setText(student.rollNumber);
                    txt_viewmarks_name.setText(student.name);
                    txt_viewmarks_course.setText(student.course);
                    txt_viewmarks_marks.setText(student.marks);
                    txt_viewmarks_remarks.setText(student.remarks);
                }else{
                    Toast.makeText(ViewMarks.this,"No student found", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
