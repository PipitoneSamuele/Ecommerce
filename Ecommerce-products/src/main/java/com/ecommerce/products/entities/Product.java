package com.ecommerce.products.entities;

public class Product {

    private String title;
    private double amount;
    private String description;
    private double rating;

    public Product() {
    }

    public Product(String title, double amount, String description, double rating) {
        this.title = title;
        this.amount = amount;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
