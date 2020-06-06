package com.example.madprojectfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Edit_Preferences extends AppCompatActivity {


    Button btn_clearpreference;
    SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__preferences);
        btn_clearpreference = (Button) findViewById(R.id.btn_clearpreference);
        btn_clearpreference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences = getSharedPreferences("shared preference", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(Edit_Preferences.this,login.class);
                startActivity(intent);
                finish();




            }
        });








    }
}
