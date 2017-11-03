package com.example.android.bai044activityforresume;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    private EditText txtUsername;
    private EditText txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();
        if(username.equals("nha") && password.equals("123")){
            Intent intent = new Intent();
            setResult(Activity.RESULT_OK, intent);
        } else {
            Intent intent = new Intent();
            setResult(Activity.RESULT_CANCELED, intent);
        }
        finish();
    }

}
