package com.example.android.bai061radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    private RadioButton radMale;
    private RadioButton radFemale;
    private RadioGroup radGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        radMale.setOnCheckedChangeListener(this);
        radFemale.setOnCheckedChangeListener(this);
        radGroup.setOnCheckedChangeListener(this);
    }

    private void initComponents() {
        radMale = findViewById(R.id.radMale);
        radFemale = findViewById(R.id.radFemale);
        radGroup = findViewById(R.id.radGroup);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String result = "(RadioButton) You are";
        if(compoundButton.getId() == R.id.radMale){
        }
        Toast.makeText(this, result, Toast.LENGTH_SHORT);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String result = "(RadioGroup) You are ";
        if(radioGroup.getId() == R.id.radGroup){
            switch(i){
                case R.id.radMale:
                    result += "Male";
                    break;
                case R.id.radFemale:
                    result += "Female";
                    break;
            }
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        }
    }
}
