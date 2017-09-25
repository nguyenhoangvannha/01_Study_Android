package com.example.hotdog.bai21xulysukien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    EditText txtA, txtB;
    Button btnSub;
    Button btnMul, btnDiv;
    View.OnClickListener  suKienChiaSe;
    Button btnHide;
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtA.getText().toString());
                int b = Integer.parseInt(txtB.getText().toString());
                int c = a - b;
                Toast.makeText(MainActivity.this, "Hieu = " + c, Toast.LENGTH_SHORT).show();
            }
        });
        suKienChiaSe = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.btnMul){
                    xuLyPhepNhan();
                }
                if(view.getId() == R.id.btnDiv){
                    xyLyPhepChia();
                }
            }
        };
        btnMul.setOnClickListener(suKienChiaSe);
        btnDiv.setOnClickListener(suKienChiaSe);
        btnHide.setOnLongClickListener(this);
        btnExit.setOnClickListener(new MyEvent());
    }

    private void xyLyPhepChia() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a / b;
        Toast.makeText(MainActivity.this, "Chia = " + c, Toast.LENGTH_SHORT);
    }

    private void xuLyPhepNhan() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a * b;
        Toast.makeText(MainActivity.this, "Nhan = " + c, Toast.LENGTH_SHORT);
    }

    private void addControls() {
        txtA = (EditText) findViewById(R.id.txtA);
        txtB = (EditText) findViewById(R.id.txtB);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnHide = (Button) findViewById(R.id.btnHide);
        btnExit = (Button) findViewById(R.id.btnExit);
    }

    public void xuLyPhepCong(View v){
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a +b;
        Toast.makeText(MainActivity.this, "Tong = " + c, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View view) {
        if(view.getId() == R.id.btnHide){
            btnHide.setVisibility(View.INVISIBLE);
        }

        return false;
    }

    public  class  MyEvent implements View.OnClickListener, View.OnLongClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId() == R.id.btnExit){
                finish();
            }
        }

        @Override
        public boolean onLongClick(View view) {
            return false;
        }
    }

    public void xuLyDoiManHinhKhac(View view){
        Button btnNew = new android.support.v7.widget.AppCompatButton(MainActivity.this){
            @Override
            public boolean performClick() {
                setContentView(R.layout.activity_main);
                addControls();
                addEvents();
                return super.performClick();
            }
        };
        btnNew.setText("Back");
        btnNew.setWidth(200);
        btnNew.setHeight(150);
        setContentView(btnNew);
    }
}
