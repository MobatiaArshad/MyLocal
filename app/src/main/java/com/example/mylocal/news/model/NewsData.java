package com.example.mylocal.news.model;

import java.io.Serializable;

public class NewsData implements Serializable {
    String title;
    String img;
    String link;

    public NewsData(String title, String img, String link) {
        this.title = title;
        this.img = img;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public String getLink() {
        return link;
    }
}
