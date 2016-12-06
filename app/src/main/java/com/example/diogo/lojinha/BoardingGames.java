package com.example.diogo.lojinha;

import android.graphics.drawable.Drawable;

/**
 * Created by diogo on 15/11/2016.
 */

public class BoardingGames {

    //String UrlImage
    Drawable image;
    String name;
    String title;
    String description;
    float price;
    int discount;

    public BoardingGames() {
    }

    public BoardingGames(String description, int discount, Drawable image, String name, float price) {
        this.description = description;
        this.discount = discount;
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BoardingGames{" +
                "price=" + price +
                ", discount=" + discount +
                '}';
    }
}
