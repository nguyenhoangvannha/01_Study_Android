package com.example.nguyenhoangvannha.bai01510clip;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button button;
    ClipDrawable clipDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.btnOk);
        button.setOnClickListener(this);
        clipDrawable = (ClipDrawable) textView.getBackground();
    }

    @Override
    public void onClick(View v) {
        clipDrawable.setLevel(clipDrawable.getLevel() + 1000);
    }
}
