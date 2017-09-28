package com.example.nguyenhoangvannha.bai0132thuchanhbuttontextviewedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            String strUsername = ((EditText) findViewById(R.id.txtUsername)).getText().toString();
            String strPassword = ((EditText) findViewById(R.id.txtPassword)).getText().toString();
            Toast.makeText(MainActivity.this, strUsername + "\n" + strPassword, Toast.LENGTH_SHORT).show();
        }
    }
}
