package com.example.android.bai087listview;

/**
 * Created by nhvn on 11/6/17.
 */

public class ContactModel {
    private String name;

    public ContactModel(String name, String phone, int iImage) {
        this.name = name;
        this.phone = phone;
        this.iImage = iImage;
    }

    private String phone;
    private int iImage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getiImage() {
        return iImage;
    }

    public void setiImage(int iImage) {
        this.iImage = iImage;
    }


}
