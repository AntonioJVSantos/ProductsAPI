package com.vodafone.exercise2.exercise2;

public class Produto {
    
    private double price;
    private String name;
    private String id;
    public Produto(double price, String name, String id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    
}
