package com.example.android.bai075dimension;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtUserName;
    private TextView txtUserInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUserName = findViewById(R.id.txtUserName);
        txtUserInfo = findViewById(R.id.txtUserInfo);

        Typeface typefaceName = Typeface.createFromAsset(getAssets(), "fonts/Actionsh.ttf");
        txtUserName.setTypeface(typefaceName);
        Typeface typefaceInfo = Typeface.createFromAsset(getAssets(), "fonts/alsscrp.ttf");
        txtUserInfo.setTypeface(typefaceInfo);
    }
}
