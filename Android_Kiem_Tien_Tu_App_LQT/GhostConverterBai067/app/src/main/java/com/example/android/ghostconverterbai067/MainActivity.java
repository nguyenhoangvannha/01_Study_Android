package com.example.android.ghostconverterbai067;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtDistance;
    private TextView txtWeight;
    private TextView txtTemperature;
    private TextView txtSpeed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        txtDistance.setOnClickListener(this);
        txtWeight.setOnClickListener(this);
        txtTemperature.setOnClickListener(this);
        txtSpeed.setOnClickListener(this);
    }

    private void initComponents() {
        txtDistance = findViewById(R.id.txtDistance);
        txtWeight = findViewById(R.id.txtWeight);
        txtTemperature = findViewById(R.id.txtTemperature);
        txtSpeed = findViewById(R.id.txtSpeed);

        //Set font
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/alsscrp.ttf");
        txtDistance.setTypeface(typeface);
        txtWeight.setTypeface(typeface);
        txtTemperature.setTypeface(typeface);
        txtSpeed.setTypeface(typeface);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.txtDistance:
                Intent intent = new Intent(this, DistanceActivity.class);
                startActivity(intent);
                break;
            case R.id.txtWeight:
                break;
            case R.id.txtTemperature:
                break;
            case R.id.txtSpeed:
                break;
        }
    }
}
