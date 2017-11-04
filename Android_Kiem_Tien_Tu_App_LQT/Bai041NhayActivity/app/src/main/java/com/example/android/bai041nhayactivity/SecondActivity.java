package com.example.android.bai041nhayactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView txtInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("Second Activity", "Create");
        Bundle extraData = getIntent().getExtras();
        txtInfo = findViewById(R.id.txtInfo);
        String name = extraData.getString("NAME");
        String info = "Hello " + name;
        txtInfo.setText(info);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Second Activity", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Second Activity", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Second Activity", "Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Second Activity", "Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Second Activity", "Stop");
    }
}
