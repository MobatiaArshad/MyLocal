package com.example.mylocal.touristGuide.model;

public class GuideData {
    String title;
    String desc;

    public GuideData(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
