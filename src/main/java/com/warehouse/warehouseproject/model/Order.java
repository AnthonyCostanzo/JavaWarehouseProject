package com.warehouse.warehouseproject.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    private Long order_id;
    private Long u_id;

    @ManyToOne
    @JoinColumn(name="order_user_id", nullable=false)
    private User user;


    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }


}
