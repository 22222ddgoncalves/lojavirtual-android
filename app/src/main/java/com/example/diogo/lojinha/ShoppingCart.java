package com.example.diogo.lojinha;

/**
 * Created by diogo on 22/11/2016.
 */

public class ShoppingCart {
    float preco_total;
    int number_items;
    BoardingGames[] cartItems;

    public ShoppingCart() {
    }

    public ShoppingCart(BoardingGames[] cartItems, int number_items, float preco_total) {
        this.cartItems = cartItems;
        this.number_items = number_items;
        this.preco_total = preco_total;
    }

    public BoardingGames[] getCartItems() {
        return cartItems;
    }

    public void setCartItems(BoardingGames[] cartItems) {
        this.cartItems = cartItems;
    }

    public int getNumber_items() {
        return number_items;
    }

    public void setNumber_items(int number_items) {
        this.number_items = number_items;
    }

    public float getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(float preco_total) {
        this.preco_total = preco_total;
    }
}
