package com.example.madprojectfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addcourses extends AppCompatActivity {
    EditText ed_addcourse;
    Button btn_addcourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcourse);
        ed_addcourse = (EditText) findViewById(R.id.ed_addcourse);
        btn_addcourse = (Button) findViewById(R.id.btn_addcourse);

        btn_addcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Course course = new Course(ed_addcourse.getText().toString());
                course.save();
                finish();
            }
        });
    }
}
