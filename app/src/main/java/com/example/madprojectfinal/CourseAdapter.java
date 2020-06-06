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

public class CourseAdapter extends BaseAdapter {
    Context context;
    Activity activity;
    List<Course> courseList;
    LayoutInflater layoutInflater;

    CourseAdapter(Context context,Activity activity, List<Course> courseList){
        this.context = context;
        this.activity = activity;
        this.courseList = courseList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return courseList.size();
    }

    @Override
    public Object getItem(int position) {
        return courseList.get(0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = layoutInflater.inflate(R.layout.course_item, null);
        TextView txt_course = (TextView) itemView.findViewById(R.id.txt_course);
        final Course course = courseList.get(position);
        txt_course.setText(course.course);
        LinearLayout course_item = (LinearLayout) itemView.findViewById(R.id.course_item);
        course_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Helper.listMode.contentEquals("addMarks")) {
                    Helper.course = course.course;
                    Intent intent = new Intent(activity, addmarks.class);
                    activity.startActivity(intent);
                }
                if(Helper.listMode.contentEquals("viewAll")){
                    Helper.course = course.course;
                    Intent intent = new Intent(activity, StudentList.class);
                    activity.startActivity(intent);
                }
            }
        });
        return itemView;
    }
}
