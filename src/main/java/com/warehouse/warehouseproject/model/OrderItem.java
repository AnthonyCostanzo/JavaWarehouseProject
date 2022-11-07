package com.warehouse.warehouseproject.model;

import com.sun.istack.NotNull;

//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "orderitems")
//public class OrderItem {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer orderItemId;
//
//    @Column(name = "productId")
//    private @NotNull Long productId;
//
//    @Column(name = "quantity")
//    private @NotNull int quantity;
//
//    @Column(name = "price")
//    private @NotNull double price;
//
//    @Column(name = "order_id")
//    private Integer orderId;
//
//    @Column(name = "created_date")
//    private Date createdDate;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id",referencedColumnName = "order_id",insertable = false,updatable = false)
//    private Order order;
//
//    @OneToOne
//    @JoinColumn(name = "item",referencedColumnName = "id",insertable = false,updatable = false)
//    private Item item;
//
//    public OrderItem(){}
//
//    public OrderItem(Integer orderId, @NotNull Long product_id, @NotNull int quantity, @NotNull double price) {
//        this.productId = product_id;
//        this.quantity = quantity;
//        this.price = price;
//        this.orderId=orderId;
//        this.createdDate = new Date();
//    }
//    //getter and setter are removed for sake of brevity
//
//}
//
