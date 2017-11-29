package com.example.nhvn.bai08fragment;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackStackActivity extends AppCompatActivity {
    Button btnReplace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_stack);
        initFragment();
        btnReplace = findViewById(R.id.btn_replace_fragment);
        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment2 = new Fragment2();
                replaceFragmentContent(fragment2);
            }
        });
    }

    private void initFragment() {
        Fragment1 fragment1 = new Fragment1();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_body, fragment1);
        fragmentTransaction.commit();
    }
    protected void replaceFragmentContent(Fragment fragment){
        if(fragment != null){
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();
        }
    }
}
