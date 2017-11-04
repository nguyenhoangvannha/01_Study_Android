package com.example.android.ghostconverterbai067;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import model.MyConvert;

public class DistanceActivity extends AppCompatActivity {
    private TextView txtWeightConvert;
    private EditText txtSourceDistance;
    private Spinner spnDistanceType;
    private TextView txtKm, txtM, txtCm, txtMm;
    private byte distanceType = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        txtSourceDistance.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                convert();
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        spnDistanceType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                distanceType = (byte)i;
                convert();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void convert() {
        txtKm.setText("0 km");
        txtM.setText("0 m");
        txtCm.setText("0 cm");
        txtMm.setText("0 mm");
        float input = 0;
        try{
            input = Float.parseFloat(txtSourceDistance.getText().toString());
        } catch (Exception e){
            return;
        }
        MyConvert.sourceType = distanceType;
        MyConvert.number = input;
        MyConvert.convert();
        txtKm.setText(MyConvert.km + " km");
        txtM.setText(MyConvert.m + " m");
        txtCm.setText(MyConvert.cm + " cm");
        txtMm.setText(MyConvert.mm + " mm");
    }

    private void initComponents() {
        txtWeightConvert = findViewById(R.id.txtWeightConverter);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Actionsh.ttf");
        txtWeightConvert.setTypeface(typeface);

        txtSourceDistance = findViewById(R.id.txtSourceDistance);
        spnDistanceType = findViewById(R.id.spnDistanceType);
        ArrayAdapter<CharSequence> arrayAdapter =
                ArrayAdapter.createFromResource(this,R.array.distance_style, R.layout.support_simple_spinner_dropdown_item);
        spnDistanceType.setAdapter(arrayAdapter);

        txtKm = findViewById(R.id.txtKm);
        txtM = findViewById(R.id.txtM);
        txtCm = findViewById(R.id.txtCm);
        txtMm = findViewById(R.id.txtMm);
    }
}
