package com.example.android.bai097gridview;

/**
 * Created by nhvn on 11/7/17.
 */

public class ContactModel {
    private int iImage;
    private String name;
    private String phone;

    public ContactModel(String name, String phone, int iImage) {
        this.iImage = iImage;
        this.name = name;
        this.phone = phone;
    }

    public int getiImage() {
        return iImage;
    }

    public void setiImage(int iImage) {
        this.iImage = iImage;
    }

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


}
