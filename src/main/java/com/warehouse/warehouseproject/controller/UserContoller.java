package com.warehouse.warehouseproject.controller;

import com.warehouse.warehouseproject.model.User;
import com.warehouse.warehouseproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserContoller {
    @Autowired
    private UserService userService;

   @PostMapping("/add")
   public User add(@RequestBody User user){
       userService.saveUser(user);
       return user;
   }

   @GetMapping("/allUsers")
   public List<User> getAllUsers() {
       return userService.getAllUsers();
   }
}
