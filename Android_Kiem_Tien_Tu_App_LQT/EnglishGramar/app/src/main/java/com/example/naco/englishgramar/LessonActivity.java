package com.example.naco.englishgramar;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LessonActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private LessonDetailAdapter detailAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        initComponents();
    }

    private void initComponents() {
        viewPager = findViewById(R.id.view_pager);
        detailAdapter = new LessonDetailAdapter(this, MainActivity.lessons);
        viewPager.setAdapter(detailAdapter);
        int id = getIntent().getExtras().getInt("POS");
        viewPager.setCurrentItem(id);
    }
}
