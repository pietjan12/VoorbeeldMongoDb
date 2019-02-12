package com.kiddybank.Logic;

import com.kiddybank.DataInterfaces.IItemRepository;
import com.kiddybank.Entities.Item;
import com.kiddybank.LogicInterfaces.IItemLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemLogic implements IItemLogic {
    private IItemRepository context;

    @Autowired
    public ItemLogic(IItemRepository context) {
        this.context = context;
    }

    @Override
    public Item getItem(int id) {
        Optional<Item> itemFromDb = context.findById(id);
        if(!itemFromDb.isPresent()) {
            throw new IllegalArgumentException("yeet");
        }

        return itemFromDb.get();
    }

    @Override
    public List<Item> getItems() {
        return context.findAll();
    }

    @Override
    public Item createItem(String name, double price) {
        Item item = new Item(name, price);
        return context.save(item);
    }
}