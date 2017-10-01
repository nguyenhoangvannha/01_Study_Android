package com.example.nguyenhoangvannha.bai01513scale;

import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ScaleDrawable scaleDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        scaleDrawable = (ScaleDrawable) textView.getBackground();
        scaleDrawable.setLevel(10000);
    }
}
