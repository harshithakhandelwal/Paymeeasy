package com.example.userService.controllers;

import com.example.userService.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


  @GetMapping
  public User getUserDetails(@RequestParam("user_id") int id){
    User u = new User();
    u.setId(1);
    u.setAdmin(false);
    u.setName("Harshi");
    u.setEmail("harshi@gmail.com");
    u.setPassword("harshi@12");

    return u;
  }
}
