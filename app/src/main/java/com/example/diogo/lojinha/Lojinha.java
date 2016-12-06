package com.example.diogo.lojinha;

import android.app.Application;

/**
 * Created by diogo on 22/11/2016.
 */
public class Lojinha extends Application{

    ShoppingCart shoppingCart;
    String username;
    String urlProfilePic;
    int age;

    private static Lojinha ourInstance = new Lojinha();

    public static Lojinha getInstance() {
        return ourInstance;
    }

    public Lojinha() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrlProfilePic() {
        return urlProfilePic;
    }

    public void setUrlProfilePic(String urlProfilePic) {
        this.urlProfilePic = urlProfilePic;
    }
}
