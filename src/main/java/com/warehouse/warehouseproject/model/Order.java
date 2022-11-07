package com.warehouse.warehouseproject.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "order_id",referencedColumnName = "order_id",insertable = false,updatable = false)
    private List<OrderItem> orderItems;


    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }


}
