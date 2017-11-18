package com.example.nguye.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtA;
    private EditText txtB;
    private TextView txtKQ;
    private Button btnGui;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        btnGui.setOnClickListener(this);
    }

    private void initComponents() {
        txtA = findViewById(R.id.editText);
        txtB = findViewById(R.id.editText2);
        btnGui = findViewById(R.id.button);
        txtKQ = findViewById(R.id.textView4);
    }

    @Override
    public void onClick(View view) {
        intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("A", Integer.parseInt(txtA.getText().toString()));
        intent.putExtra("B", Integer.parseInt(txtB.getText().toString()));
        startActivityForResult(intent, 69);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == 96){
            txtKQ.setText("Ket qua cong: " + data.getIntExtra("KQ",0));
        }
    }
}
