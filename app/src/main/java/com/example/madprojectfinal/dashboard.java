package com.example.madprojectfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {

    Button btn_settings;
    Button btn_addcourse;
    Button btn_addmarks;
    Button btn_view;
    Button btn_viewall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn_addcourse = (Button) findViewById(R.id.btn_addcourse);
        btn_addcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, addcourses.class);
                startActivity(intent);
            }
        });
        btn_settings = (Button) findViewById(R.id.btn_settings);
        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, Edit_Preferences.class);
                startActivity(intent);
            }
        });
        btn_addmarks = (Button) findViewById(R.id.btn_addmarks);
        btn_addmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Helper.listMode = "addMarks";
                Intent intent = new Intent(dashboard.this, SelectCourse.class);
                startActivity(intent);
            }
        });
        btn_view = (Button) findViewById(R.id.btn_view);
        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, ViewMarks.class);
                startActivity(intent);
            }
        });
        btn_viewall = (Button) findViewById(R.id.btn_viewall);
        btn_viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Helper.listMode = "viewAll";
                Intent intent = new Intent(dashboard.this, ViewAll.class);
                startActivity(intent);
            }
        });
    }
}
