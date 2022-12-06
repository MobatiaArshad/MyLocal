package com.example.mylocal.advertisement.model;

public class AdsModel {
    String title;
    String image;
    String desc;
    String category;
    Boolean isSelected;

    public AdsModel(String title, String image, String desc, String category,Boolean isSelected) {
        this.title = title;
        this.image = image;
        this.desc = desc;
        this.category = category;
        this.isSelected = isSelected;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getDesc() {
        return desc;
    }

    public String getCategory() {
        return category;
    }
}
