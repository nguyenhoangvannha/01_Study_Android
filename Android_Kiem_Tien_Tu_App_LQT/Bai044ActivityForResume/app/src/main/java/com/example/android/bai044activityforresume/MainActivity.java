package com.example.android.bai044activityforresume;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLoginNow;
    private TextView txtLoginFirst;
    public static  final int LOGIN_REQUEST_CODE_1 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Set no title bar
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //hide action bar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //lock orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoginNow = findViewById(R.id.btnLoginNow);
        txtLoginFirst = findViewById(R.id.txtLoginFirst);
        btnLoginNow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivityForResult(intent, LOGIN_REQUEST_CODE_1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == LOGIN_REQUEST_CODE_1){
            if(resultCode == Activity.RESULT_OK){
                txtLoginFirst.setText("Loggin Successfull");
                btnLoginNow.setVisibility(View.INVISIBLE);
            } else if(resultCode == Activity.RESULT_CANCELED){
                txtLoginFirst.setText("Loggin fail");
                btnLoginNow.requestFocus();
            }
        }
    }
}
