package com.example.mylocal.news.model;

public class NewsData {
    String title;
    String desc;
    String img;
    String postedDate;
    String author;
    String category;
    int isLiked;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getImg() {
        return img;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getIsLiked() {
        return isLiked;
    }

    public NewsData(String title, String desc, String img, String postedDate, String author, String category, int isLiked) {
        this.title = title;
        this.desc = desc;
        this.img = img;
        this.postedDate = postedDate;
        this.author = author;
        this.category = category;
        this.isLiked = isLiked;
    }
}
