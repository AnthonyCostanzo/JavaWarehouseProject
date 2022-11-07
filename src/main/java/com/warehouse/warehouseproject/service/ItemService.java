package com.warehouse.warehouseproject.service;
import java.util.List;
import com.warehouse.warehouseproject.model.Item;
import org.springframework.stereotype.Service;


public interface ItemService {
    public List<Item> getAllItems();
    public void saveItem(Item item);

    public void deleteItem(Long id);

    public void updateItem(Long item_id,Item item);
}
