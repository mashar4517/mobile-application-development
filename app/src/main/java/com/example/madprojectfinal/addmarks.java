package com.example.madprojectfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addmarks extends AppCompatActivity {

    EditText ed_rollno;
    EditText ed_name;
    EditText ed_marks;
    EditText ed_remarks;
    Button btn_addmarks_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmarks);
        ed_rollno = (EditText) findViewById(R.id.ed_addmarks_rollno);
        ed_name = (EditText) findViewById(R.id.ed_addmarks_name);
        ed_marks = (EditText) findViewById(R.id.ed_addmarks_marks);
        ed_remarks = (EditText) findViewById(R.id.ed_addmarks_remarks);
        btn_addmarks_submit = (Button) findViewById(R.id.btn_addmarks_submit);

        btn_addmarks_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(ed_rollno.getText().toString(), ed_name.getText().toString(), ed_marks.getText().toString(), ed_remarks.getText().toString(), Helper.course);
                student.save();
            }
        });

    }
}
