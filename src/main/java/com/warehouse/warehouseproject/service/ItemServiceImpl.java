package com.warehouse.warehouseproject.service;
import com.warehouse.warehouseproject.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.warehouse.warehouseproject.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;


@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    };

    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);
    }
    @Transactional
    public void updateItem(Long item_id,Item item) {
        Item foundItem = itemRepository.findById(item_id)
                .orElseThrow(() -> new IllegalStateException("Item not present in inventory"));
        if (item.getItem_name() != null && item.getItem_name().length() > 0 && !Objects.equals(foundItem.getItem_name(), item.getItem_name()))
            foundItem.setItem_name(item.getItem_name());

        if (item.getItem_price() > 0 && item.getItem_price() != foundItem.getItem_price()) {
            foundItem.setItem_price(item.getItem_price());
        }
        if (item.getQuantity() >= 0 && item.getQuantity() != foundItem.getQuantity()) {
            foundItem.setQuantity(item.getQuantity());
        }

        System.out.println(item.getItem_name());
    }
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }


}
