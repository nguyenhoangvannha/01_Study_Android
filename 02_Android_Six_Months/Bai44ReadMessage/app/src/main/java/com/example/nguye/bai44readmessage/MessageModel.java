package com.example.nguye.bai44readmessage;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by nguye on 22-Nov-17.
 */

public class MessageModel {
    private String phone;
    private String body;
    private String date;

    public MessageModel(String phone, String body, String date) {
        this.phone = phone;
        this.body = body;
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public String getBody() {
        return body;
    }

    public String getDate() {
        return date;
    }
    public String getDateString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date(Long.parseLong(getDate()));
        return simpleDateFormat.format(date);
    }
}
