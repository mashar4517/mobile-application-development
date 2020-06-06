package com.example.madprojectfinal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    Context context;
    Activity activity;
    List<Student> studentList;
    LayoutInflater layoutInflater;

    StudentAdapter(Context context, Activity activity, List<Student> studentList){
        this.context = context;
        this.activity = activity;
        this.studentList = studentList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = layoutInflater.inflate(R.layout.student_item,null);
        TextView txt_rollno = (TextView) itemView .findViewById(R.id.txt_list_rollno);
        TextView txt_name = (TextView) itemView .findViewById(R.id.txt_list_name);
        TextView txt_marks = (TextView) itemView .findViewById(R.id.txt_list_marks);
        TextView txt_remarks = (TextView) itemView .findViewById(R.id.txt_list_remarks);
        final Student student = studentList.get(position);
        txt_rollno.setText(student.rollNumber);
        txt_name.setText(student.name);
        txt_marks.setText(student.marks);
        txt_remarks.setText(student.remarks);
        return itemView ;
    }
}
