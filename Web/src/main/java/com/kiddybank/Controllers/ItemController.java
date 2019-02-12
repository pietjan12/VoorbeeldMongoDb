package com.kiddybank.Controllers;

import com.kiddybank.Entities.Item;
import com.kiddybank.LogicInterfaces.IItemLogic;
import com.kiddybank.Wrappers.createItemRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(path="/item")
public class ItemController {
    private IItemLogic _itemLogic;

    @Autowired
    public ItemController(IItemLogic itemLogic) {
        this._itemLogic = itemLogic;
    }

    @PostMapping
    public Item CreateItem(@RequestBody createItemRequestModel createItemRequestModel) throws IllegalArgumentException {
        return _itemLogic.createItem(createItemRequestModel.getName(), createItemRequestModel.getPrice());
    }

    @GetMapping(path = "/{id}")
    public Item GetItemById(@PathVariable("id") int id) {
        return _itemLogic.getItem(id);
    }

    @GetMapping
    public List<Item> GetItems () {
       return _itemLogic.getItems();
    }
}