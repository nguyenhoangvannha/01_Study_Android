package com.example.nguye.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtNhan;
    private Button btnTinh;
    private Intent intent;
    private  int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtNhan = findViewById(R.id.textView3);
        btnTinh = findViewById(R.id.button2);
        intent = getIntent();
        a = intent.getIntExtra("A",0);
        b = intent.getIntExtra("B", 0);
        txtNhan.setText("A: " + a + "\nB: " + b);
        btnTinh.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int c = a + b;
        intent.putExtra("KQ",c);
        setResult(96, intent);
        this.finish();
    }
}
