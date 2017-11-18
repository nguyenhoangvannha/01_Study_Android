package com.example.android.gamefreakingmathbai081;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtAppName;
    private ImageView imgAppIcon;
    private Button btnPlayNow;
    private Typeface tfItalic;
    private Typeface tfBold;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        btnPlayNow.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initComponents() {
        txtAppName = findViewById(R.id.txtAppName);
        imgAppIcon = findViewById(R.id.imgAppIcon);
        btnPlayNow = findViewById(R.id.btnPlayButton);
        tfItalic = Typeface.createFromAsset(getAssets(), "fonts/alsscrp.ttf");
        tfBold = Typeface.createFromAsset(getAssets(),"fonts/Actionsh.ttf");
        txtAppName.setTypeface(tfBold);
        btnPlayNow.setTypeface(tfItalic);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getDrawable(R.drawable.actionbar_background));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPlayButton:
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(intent);
                break;
        }
    }
}
