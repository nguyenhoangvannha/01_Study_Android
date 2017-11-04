package com.example.android.bai062checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox chkCPP, chkJava, chkCSharp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        chkCPP.setOnCheckedChangeListener(this);
        chkJava.setOnCheckedChangeListener(this);
        chkCSharp.setOnCheckedChangeListener(this);
    }

    private void initComponents() {
        chkCPP = findViewById(R.id.chkCPP);
        chkCSharp = findViewById(R.id.chkCSharp);
        chkJava = findViewById(R.id.chkJava);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String result = "Ban da hoc ";

    }
}
