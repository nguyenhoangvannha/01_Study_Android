package com.example.android.bai087listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, IContactInfo {
    private ArrayList<ContactModel> arrContact;
    private ListView listView;
    private ImageView imgAvatar;
    private TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        listView.setOnItemClickListener(this);
    }

    private void initComponents() {
        imgAvatar = findViewById(R.id.imgContactShow);
        txtName = findViewById(R.id.txtNameShow);
        arrContact = new ArrayList<>();
        initArrContact();
        listView = findViewById(R.id.lstContact);
        ContactAdapter contactAdapter = new ContactAdapter(this, arrContact, this);
        listView.setAdapter(contactAdapter);
    }

    private void initArrContact() {
        arrContact.add(new ContactModel("Dang Quang Ha", "098 534 252", 0));
        arrContact.add(new ContactModel("Ha Quang Tuan", "098 534 444", 5));
        arrContact.add(new ContactModel("Dang Ha Tuan", "098 343 888", 6));
        arrContact.add(new ContactModel("Nguyen Ha Tuan", "098 343 352", 1));
        arrContact.add(new ContactModel("Nguyen Ha Tuan", "098 343 352", 1));
        arrContact.add(new ContactModel("Hoan Ha Tuan", "098 343 454", 2));
        arrContact.add(new ContactModel("Dang Quang Tuan", "098 343 888", 3));
        arrContact.add(new ContactModel("Ha Le Tuan", "098 343 323", 4));
        arrContact.add(new ContactModel("Dang Quang Tuan", "098 768 888", 7));
        arrContact.add(new ContactModel("Ha Quang Tuan", "098 534 444", 5));
        arrContact.add(new ContactModel("Dang Ha Tuan", "098 343 888", 6));
        arrContact.add(new ContactModel("Nguyen Ha Tuan", "098 343 352", 1));
        arrContact.add(new ContactModel("Hoan Ha Tuan", "098 343 454", 2));
        arrContact.add(new ContactModel("Dang Quang Tuan", "098 343 888", 3));
        arrContact.add(new ContactModel("Dang Quang Tuan", "098 768 888", 7));
        arrContact.add(new ContactModel("Ha Le Tuan", "098 235 235", 8));
        arrContact.add(new ContactModel("Le Quang Tuan", "098 343 568", 9));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ContactModel model = arrContact.get(i);
        Toast.makeText(this, model.getName(), Toast.LENGTH_SHORT).show();
    }

    public void showInfo(ContactModel model)
    {
        this.imgAvatar.setImageResource(R.drawable.user);
        this.txtName.setText(model.getName());
    }

    @Override
    public void showUserInfo(ContactModel model) {
        this.imgAvatar.setImageResource(R.drawable.user);
        this.txtName.setText(model.getName());
    }
}
