package com.dmeo.cartsystem;

public class Product {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Product(String name, Double price) {
        if (price<0){
            System.out.println("Invalid price");
            return;
        }
        this.name = name;
        this.price = price;
    }
}
