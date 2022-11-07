package com.warehouse.warehouseproject.repository;

import com.warehouse.warehouseproject.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository  extends JpaRepository<Order, Integer> {
//    List<Order> findAllByUserIdOrderByCreatedDateDesc(Integer userId);
}
