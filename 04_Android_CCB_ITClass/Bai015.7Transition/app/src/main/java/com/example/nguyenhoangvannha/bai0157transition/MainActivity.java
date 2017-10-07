package com.example.nguyenhoangvannha.bai0157transition;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TransitionDrawable transitionDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        transitionDrawable = (TransitionDrawable) textView.getBackground();
    }
    public  void BatDau(View v){
        transitionDrawable.reverseTransition(3000);
    }
}
