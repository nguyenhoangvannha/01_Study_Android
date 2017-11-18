package com.example.android.bai098viewpaper;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int[] arrImage = {R.drawable.img_01,R.drawable.img_02,R.drawable.img_03,R.drawable.img_04,
            R.drawable.img_05,R.drawable.img_06,R.drawable.img_07};
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        viewPager = findViewById(R.id.viewPager);
        ViewPaperAdapter viewPaperAdapter = new ViewPaperAdapter(this, arrImage);
        viewPager.setAdapter(viewPaperAdapter);
        //viewPager.setCurrentItem(1); // dat vi tri mac dinh khi mo ung dung
    }

}
