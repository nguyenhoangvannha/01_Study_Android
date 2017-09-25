package com.example.hotdog.bai22checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAndroid, chkWP, chkIOS;
    Button btnDangKy;
    TextView txtMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDangKyOnClick(view);
            }
        });
    }

    private void btnDangKyOnClick(View view) {
        StringBuilder result = new StringBuilder();
        if(chkAndroid.isChecked()){
            result.append(chkAndroid.getText().toString());
        }
        if(chkWP.isChecked()){
            result.append("\n" + chkWP.getText().toString());
        }
        if(chkIOS.isChecked()){
            result.append("\n" + chkIOS.getText().toString());
        }
        txtMonHoc.setText(result.toString());
    }

    private void addControls() {
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWP = (CheckBox) findViewById(R.id.chkWP);
        chkIOS = (CheckBox) findViewById(R.id.chkIOS);
        txtMonHoc = (TextView) findViewById(R.id.txtMonHoc);
        btnDangKy = (Button) findViewById(R.id.btnDangKy);
    }
}
