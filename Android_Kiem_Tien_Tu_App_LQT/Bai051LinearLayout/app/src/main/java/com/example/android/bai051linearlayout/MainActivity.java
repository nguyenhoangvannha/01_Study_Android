package com.example.android.bai051linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnNum00;
    private Button btnNum01;
    private Button btnNum02;
    private Button btnNum03;
    private Button btnNum04;
    private Button btnNum05;
    private Button btnNum06;
    private Button btnNum07;
    private Button btnNum08;
    private Button btnNum09;

    private TextView txtDisplay;
    private StringBuilder strDisplay = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        btnNum00.setOnClickListener(this);
        btnNum01.setOnClickListener(this);
        btnNum02.setOnClickListener(this);
        btnNum03.setOnClickListener(this);
        btnNum04.setOnClickListener(this);
        btnNum05.setOnClickListener(this);
        btnNum06.setOnClickListener(this);
        btnNum07.setOnClickListener(this);
        btnNum08.setOnClickListener(this);
        btnNum09.setOnClickListener(this);
    }

    private void initComponents() {
        txtDisplay = findViewById(R.id.txtDisplay);
        btnNum00 = findViewById(R.id.btnNum00);
        btnNum01 = findViewById(R.id.btnNum01);
        btnNum02 = findViewById(R.id.btnNum02);
        btnNum03 = findViewById(R.id.btnNum03);
        btnNum04 = findViewById(R.id.btnNum04);
        btnNum05 = findViewById(R.id.btnNum05);
        btnNum06 = findViewById(R.id.btnNum06);
        btnNum07 = findViewById(R.id.btnNum07);
        btnNum08 = findViewById(R.id.btnNum08);
        btnNum09 = findViewById(R.id.btnNum09);
    }

    @Override
    public void onClick(View view) {
        String num = "";
        switch(view.getId())
        {
            case R.id.btnNum00:
                num = btnNum00.getText().toString();
                break;
            case R.id.btnNum01:
                num = btnNum01.getText().toString();
                break;
            case R.id.btnNum02:
                num = btnNum02.getText().toString();
                break;
            case R.id.btnNum03:
                num = btnNum03.getText().toString();
                break;
            case R.id.btnNum04:
                num = btnNum04.getText().toString();
                break;
            case R.id.btnNum05:
                num = btnNum05.getText().toString();
                break;
            case R.id.btnNum06:
                num = btnNum06.getText().toString();
                break;
            case R.id.btnNum07:
                num = btnNum07.getText().toString();
                break;
            case R.id.btnNum08:
                num = btnNum08.getText().toString();
                break;
            case R.id.btnNum09:
                num = btnNum09.getText().toString();
                break;
        }
        strDisplay.append(num);
        txtDisplay.setText(strDisplay.toString());
    }
}
