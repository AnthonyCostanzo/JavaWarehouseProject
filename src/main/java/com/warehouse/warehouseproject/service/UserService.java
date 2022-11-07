package com.warehouse.warehouseproject.service;

import com.warehouse.warehouseproject.model.User;
import com.warehouse.warehouseproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    public void saveUser(User user);
    public List<User> getAllUsers();
}
