package com.example.naco.englishgramar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static ArrayList<LessonModel> lessons;
    private EditText txtSearch;
    private ListView lstLessons;
    private LessonAdapter lessonAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        lstLessons.setOnItemClickListener(this);
        txtSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                searchLessons(txtSearch.getText().toString());
            }
        });
    }

    private void searchLessons(String s) {

    }

    private void initComponents() {
        txtSearch = findViewById(R.id.txt_search);
        lstLessons = findViewById(R.id.lst_lessons);
        lessons = new ArrayList<LessonModel>();
        initLessons();
        lessonAdapter = new LessonAdapter(this, lessons);
        lstLessons.setAdapter(lessonAdapter);
    }

    private void initLessons() {
        lessons.add(new LessonModel(0, "Pass simple"));
        lessons.add(new LessonModel(1, "Pass continuous"));
        lessons.add(new LessonModel(2, "Pass perfect"));
        lessons.add(new LessonModel(3, "Present simple"));
        lessons.add(new LessonModel(4, "Present continuous"));
        lessons.add(new LessonModel(5, "Present perfect"));
        lessons.add(new LessonModel(6, "Yes/No Question"));
        lessons.add(new LessonModel(7, "W,H Questions"));
        lessons.add(new LessonModel(8, "Introduce your self"));
        lessons.add(new LessonModel(9, "Meeting"));
        lessons.add(new LessonModel(10, "Calendar"));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, LessonActivity.class);
        intent.putExtra("POS", i);
        startActivity(intent);
    }
}
