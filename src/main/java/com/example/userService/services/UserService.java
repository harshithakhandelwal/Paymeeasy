package com.example.userService.services;

import com.example.userService.models.User;
import com.example.userService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

  @Autowired
  public UserRepository userRepository;

  public Optional<User> getUserDetails(int id) {
    return userRepository.findById(id);
  }

  public ArrayList<User> geAllUserDetails() {
    return userRepository.findAll();

  }

  public User addUserDetails(User user) {
    return userRepository.save(user);

  }

  public User updateUserDetails(int id, User user) {
    return new User();

  }

  public User deleteUserDetails() {
    return new User();
  }
}
