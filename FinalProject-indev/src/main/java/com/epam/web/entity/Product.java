package com.epam.web.entity;

public class Product implements Entity {
    private long id;
    private String productname;
    private int price;
    private boolean recipe;

    public Product(long id, String productname, int price, boolean recipe) {
        this.id = id;
        this.productname = productname;
        this.price = price;
        this.recipe = recipe;
    }

    public Long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRecipe() {
        return recipe;
    }

    public void setRecipe(boolean recipe) {
        this.recipe = recipe;
    }
}
