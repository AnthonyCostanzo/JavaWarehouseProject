package com.warehouse.warehouseproject.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    private String name;

    public String getName() {
        return name;
    }

//    @OneToMany(mappedBy = "user")
//    private List<Order> orders;

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    private String email;
    @NotNull
    private String password;

    public long getUserId() {
        return id;
    }


    public void setUserId(long userId) {
        this.id = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(){};

    public User(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
