package com.kiddybank.DataInterfaces;

import com.kiddybank.Entities.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IItemRepository extends MongoRepository<Item, Integer> {
    Optional<Item> findByName(String name);
}
