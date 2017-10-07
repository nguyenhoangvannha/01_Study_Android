package com.howkteam.howkteamandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button = new Button(this);
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null){
            Log.e(TAG,"Bug HowKTeam");
        } else{
            Log.e(TAG,"Wellcome to HowKTeam.com");
        }
        setContentView(R.layout.activity_main);
        button.setText("Button HKT");
    }
}
