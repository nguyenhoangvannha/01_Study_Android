package com.example.nguyenhoangvannha.bai013random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRand = (Button) findViewById(R.id.btnRand);
        btnRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = Integer.parseInt(((EditText)findViewById(R.id.txtMinValue)).getText().toString());
                int max = Integer.parseInt(((EditText)findViewById(R.id.txtMaxValue)).getText().toString());
                int ret = (int)(Math.random()%(max - min + 1)) + min;
                Toast.makeText(MainActivity.this, "Random: " + ret, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
