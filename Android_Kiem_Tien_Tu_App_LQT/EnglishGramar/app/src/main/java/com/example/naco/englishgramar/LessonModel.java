package com.example.naco.englishgramar;

/**
 * Created by nguye on 10-Nov-17.
 */

public class LessonModel {
    private int id;
    private String name;
    public LessonModel(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
