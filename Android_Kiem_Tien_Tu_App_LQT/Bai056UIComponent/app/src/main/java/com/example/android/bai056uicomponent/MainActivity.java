package com.example.android.bai056uicomponent;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtFonts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFonts = findViewById(R.id.txtFonts);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/Actionsh.ttf");
        txtFonts.setTypeface(typeface);
    }
}
