package com.example.naco.englishgramar;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nguye on 10-Nov-17.
 */

public class LessonAdapter extends BaseAdapter {
    private ArrayList<LessonModel> lessons;
    private Context context;
    public LessonAdapter(Context context, ArrayList<LessonModel> lessons){
        this.context = context;
        this.lessons = lessons;
    }
    @Override
    public int getCount() {
        return lessons.size();
    }

    @Override
    public Object getItem(int i) {
        return lessons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return lessons.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View rowView;
        if(view == null){
            rowView = inflater.inflate(R.layout.lesson_item, viewGroup, false);
            LayoutHandler layoutHandler = new LayoutHandler();
            layoutHandler.btnLesson = rowView.findViewById(R.id.btn_lesson);
            layoutHandler.txtLesson = rowView.findViewById(R.id.txt_lesson);
            rowView.setTag(layoutHandler);
        } else {
            rowView = view;
        }
        LayoutHandler layoutHandler = (LayoutHandler) rowView.getTag();
        layoutHandler.txtLesson.setText(lessons.get(i).getName());
        return rowView;
    }
    class LayoutHandler{
        ImageButton btnLesson;
        TextView txtLesson;
    }
}
