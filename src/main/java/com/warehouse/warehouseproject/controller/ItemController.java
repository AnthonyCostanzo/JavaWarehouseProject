package com.warehouse.warehouseproject.controller;

import com.warehouse.warehouseproject.model.Item;
import com.warehouse.warehouseproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/items")
@CrossOrigin
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/addItem")
    public Item addItem(@RequestBody Item item) {
        itemService.saveItem(item);
        return item;
    }

    @GetMapping("/allItems")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @DeleteMapping(path = "/delete/{item_id}")
    public void deleteItem(@PathVariable("item_id") Long item_id) {
        itemService.deleteItem(item_id);
    }

    @PutMapping(path="/update/{item_id}")
    public void updateItem(@PathVariable("item_id") Long item_id,
                           @RequestBody Item item) {
        itemService.updateItem(item_id,item);
        System.out.println("Done");
    }
}
