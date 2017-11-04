package com.example.android.bai041nhayactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSwitch;
    private EditText txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSwitch = findViewById(R.id.btnSwitch);
        txtName = findViewById(R.id.txtName);
        btnSwitch.setOnClickListener(this);
        Log.i("My app", "Create");
    }

    @Override
    public void onClick(View view) {
        String name = txtName.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NAME", name);

        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My app", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My app", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My app", "Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My app", "Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My app", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My app", "Destroy");
    }
}
