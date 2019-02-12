package com.kiddybank.Entities;

import org.springframework.data.annotation.Id;

public class Item {
    @Id
    private int ID;

    private String name;
    private double price;

    public Item(){}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
