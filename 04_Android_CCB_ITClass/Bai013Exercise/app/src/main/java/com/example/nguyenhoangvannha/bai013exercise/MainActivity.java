package com.example.nguyenhoangvannha.bai013exercise;

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
        setContentView(R.layout.layout);
        btnRand = (Button) findViewById(R.id.btnRand);
        btnRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = Integer.parseInt(((EditText)findViewById(R.id.txtMinValue)).getText().toString());
                int max = Integer.parseInt(((EditText)findViewById(R.id.txtMaxValue)).getText().toString());
                Random random = new Random();
                int ret = random.nextInt(max) + min;
                Toast.makeText(MainActivity.this, ret, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void btnExeOnClick(View v){
        int a = Integer.parseInt(((EditText)findViewById(R.id.txtNum01)).getText().toString());
        int b = Integer.parseInt(((EditText)findViewById(R.id.txtNum02)).getText().toString());
        int c = a + b;
        Toast.makeText(MainActivity.this, "Sum = " + c, Toast.LENGTH_SHORT).show();
    }
}
