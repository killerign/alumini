package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Users;
import com.example.demo.respository.User_respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class Usercontroller {
    @Autowired
    User_respository user;

    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAll(@RequestParam(required = false) String title) {
        try {
          List<Users> users = new ArrayList<Users>();
            user.findAll().forEach(users::add);
          if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
          }
      
          return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
          System.out.println(e.toString());
          return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
      }
}
