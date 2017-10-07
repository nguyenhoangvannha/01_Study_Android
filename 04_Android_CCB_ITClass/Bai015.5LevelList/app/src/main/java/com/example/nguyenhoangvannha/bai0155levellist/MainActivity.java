package com.example.nguyenhoangvannha.bai0155levellist;

import android.media.Image;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ImageView hinhpin;
    private Button btnIncrease;
    private int i = 1;
    Handler handler;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hinhpin = (ImageView) findViewById(R.id.imageView);
        btnIncrease = (Button) findViewById(R.id.btnIncrease);
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if(msg.what < 5){
                    i++;
                    if(i > 5) i = 0;
                    hinhpin.setImageLevel(i);
                }
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        }, 1000, 1000);
        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i > 5) i = 0;
                hinhpin.setImageLevel(i);
            }
        });
    }
}
