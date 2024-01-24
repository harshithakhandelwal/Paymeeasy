package com.example.userService.repositories;

import com.example.userService.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface UserRepository extends CrudRepository<User, Integer> {

  ArrayList<User> findAll();
}