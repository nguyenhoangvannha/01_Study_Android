package com.example.nguyenhoangvannha.bai013button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnXuat;
    Button btnXinChao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnXinChao = (Button) findViewById(R.id.btnXinChao);
        btnXinChao = (Button) findViewById(R.id.btnOk);
//        btnXinChao.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Onclick listener", Toast.LENGTH_SHORT).show();
//            }
//        });
        btnXinChao.setOnClickListener(this);
        btnXuat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String strViewContent = String.valueOf(((Button)v).getText());
        switch (v.getId()){
            case R.id.btnOk:
                Toast.makeText(MainActivity.this, "Toast ok showed " + strViewContent, Toast.LENGTH_LONG ).show();
                break;
            case R.id.btnXinChao:
                Toast.makeText(MainActivity.this, "Toast btnXinChao", Toast.LENGTH_LONG).show();
                break;
            default:
        }
    }


//    public void xuatThongBao(View v){
//        String strViewContent = String.valueOf(((Button)v).getText());
//        switch (v.getId()){
//            case R.id.btnOk:
//                Toast.makeText(MainActivity.this, "Toast ok showed " + strViewContent, Toast.LENGTH_LONG ).show();
//                break;
//            case R.id.btnXinChao:
//                Toast.makeText(MainActivity.this, "Toast btnXinChao", Toast.LENGTH_LONG).show();
//                break;
//            default:
//        }
//    }
}
