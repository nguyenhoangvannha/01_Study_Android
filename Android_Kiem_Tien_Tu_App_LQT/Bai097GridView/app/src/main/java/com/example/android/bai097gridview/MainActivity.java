package com.example.android.bai097gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ContactModel> arrContact;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        arrContact = new ArrayList<ContactModel>();
        gridView = findViewById(R.id.gridView);
        initArrContact();
        ContactAdapter contactAdapter = new ContactAdapter(this ,arrContact);
        gridView.setAdapter(contactAdapter);
    }

    private void initArrContact() {
        arrContact.add(new ContactModel("Dang Quang Ha", "098 534 252", 0));
        arrContact.add(new ContactModel("Ha Quang Huong", "098 534 444", 5));
        arrContact.add(new ContactModel("Dang Ha Tuan", "098 343 888", 6));
        arrContact.add(new ContactModel("Nguyen Ha Dang", "098 343 352", 1));
        arrContact.add(new ContactModel("Nguyen Ha Viet", "098 343 352", 1));
        arrContact.add(new ContactModel("Hoan Ha Quang", "098 343 454", 2));
        arrContact.add(new ContactModel("Dang Quang Tuan", "098 343 888", 3));
        arrContact.add(new ContactModel("Ha Le Ngoc", "098 343 323", 4));
        arrContact.add(new ContactModel("Dang Quang La", "098 768 888", 7));
        arrContact.add(new ContactModel("Ha Quang Tuan", "098 534 444", 5));
        arrContact.add(new ContactModel("Dang Ha Tuan", "098 343 888", 6));
        arrContact.add(new ContactModel("Nguyen Ha Thi", "098 343 352", 1));
        arrContact.add(new ContactModel("Hoan Ha Da", "098 343 454", 2));
        arrContact.add(new ContactModel("Dang Quang Ma", "098 343 888", 3));
        arrContact.add(new ContactModel("Dang Quang Ha", "098 534 252", 0));
        arrContact.add(new ContactModel("Ha Quang Huong", "098 534 444", 5));
        arrContact.add(new ContactModel("Dang Ha Tuan", "098 343 888", 6));
        arrContact.add(new ContactModel("Nguyen Ha Dang", "098 343 352", 1));
        arrContact.add(new ContactModel("Dang Quang Hai", "098 768 888", 7));
        arrContact.add(new ContactModel("Ha Le Mai", "098 235 235", 8));
        arrContact.add(new ContactModel("Le Quang Tuan", "098 343 568", 9));
        arrContact.add(new ContactModel("Nguyen Ha Viet", "098 343 352", 1));
        arrContact.add(new ContactModel("Hoan Ha Quang", "098 343 454", 2));
        arrContact.add(new ContactModel("Dang Quang Tuan", "098 343 888", 3));
        arrContact.add(new ContactModel("Ha Le Ngoc", "098 343 323", 4));
        arrContact.add(new ContactModel("Dang Quang La", "098 768 888", 7));
        arrContact.add(new ContactModel("Ha Quang Tuan", "098 534 444", 5));
        arrContact.add(new ContactModel("Dang Ha Tuan", "098 343 888", 6));
        arrContact.add(new ContactModel("Nguyen Ha Thi", "098 343 352", 1));
        arrContact.add(new ContactModel("Hoan Ha Da", "098 343 454", 2));
    }
}
