package com.example.userService.controllers;

import com.example.userService.models.User;
import com.example.userService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  public UserService userService;

  @GetMapping(path = "/user")
  public Optional<User> getUserDetails(@RequestParam("user_id") int id) {
    return userService.getUserDetails(id);
  }

  @GetMapping
  public ArrayList<User> getAllUserDetails() {
    return userService.geAllUserDetails();
  }

  @PostMapping(path = "/user")
  public User addUserDetails(@RequestBody User user) {
    return userService.addUserDetails(user);
  }

  @PutMapping
  public User updateUserDetails(@RequestParam("user_id") int id, @RequestBody User user) {
    return userService.updateUserDetails(id, user);
  }

  @DeleteMapping
  public User deleteUserDetails(@RequestParam("user_id") int id) {
    return userService.deleteUserDetails();
  }
}
