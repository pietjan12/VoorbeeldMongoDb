package com.kiddybank.Entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Item {
    @Id
    @Field("id")
    private String itemID;

    private String name;
    private double price;

    public Item(){}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getItemID() {
        return itemID   ;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
