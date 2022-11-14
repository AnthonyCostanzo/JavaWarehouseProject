//package com.warehouse.v3.controller;
//
//import com.warehouse.v3.models.User;
//import com.warehouse.v3.repositories.UserRepository;
//import com.warehouse.v3.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.web.bind.annotation.*;
//
//import javax.swing.text.html.Option;
//import java.util.List;
//import java.util.Optional;
//
//
//@RestController
////@RequestMapping(path = "/user")
////@CrossOrigin
////public class UserController {
////
////    @Autowired
////    private UserService userService;
////
////
////    @GetMapping(path = "/all")
////    public List<User> getUsers() {
////        return userService.getAllUsers();
////    }
////    @PostMapping("/add")
////    public User addUser(@RequestBody User newUser) {
////        return userService.addUser(newUser);
////    }
////
////    @GetMapping("/{id}")
////    public User getUserById(@PathVariable Long id) {
////        return userService.findUserById(id);
////    }
////
////    @PutMapping("/{id}")
////    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
////        return userService.updateUser(id,updatedUser);
////    }
////
////    @DeleteMapping("/delete/{id}")
////    public String deleteUser(@PathVariable Long id) {
////        return userService.deleteUser(id);
////    }
////
////}
