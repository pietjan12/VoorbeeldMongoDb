package com.kiddybank.LogicInterfaces;

import com.kiddybank.Entities.Item;
import org.springframework.security.access.AccessDeniedException;
import java.security.Principal;
import java.util.List;

public interface IItemLogic {
    Item getItem(int id);
    List<Item> getItems();
    Item createItem(String name, double price);
}
