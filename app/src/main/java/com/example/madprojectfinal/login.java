package com.example.madprojectfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {


    EditText ed_fname,ed_lname,ed_email;
    Button btn_submit;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed_fname = (EditText) findViewById(R.id.ed_fname);
        ed_lname = (EditText) findViewById(R.id.ed_lname);
        ed_email = (EditText) findViewById(R.id.ed_email);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        sharedPreferences = getSharedPreferences("shared preference",MODE_PRIVATE);

        String fname = sharedPreferences.getString("F_Name","invalid");
        if(!fname.contentEquals("invalid")){
            Intent intent = new Intent(login.this,dashboard.class);
            startActivity(intent);
            finish();
        }


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fn = ed_fname.getText().toString();
                String ln = ed_lname.getText().toString();
                String em = ed_email.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("F_Name", ed_fname.getText().toString());
                editor.putString("L_Name", ed_lname.getText().toString());
                editor.putString("email", ed_email.getText().toString());
                editor.commit();
                Intent intent = new Intent(login.this,dashboard.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
