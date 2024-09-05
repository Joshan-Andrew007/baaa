package com.usermanagement.userr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.userr.model.Userinfo;
import com.usermanagement.userr.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<Userinfo> addUser(@RequestBody Userinfo user) 
    {
        return ResponseEntity.ok(userService.addUserId(user)); 
    }

    @GetMapping
    public ResponseEntity<List<Userinfo>> getAll()
    {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Userinfo>> getUserId(@PathVariable int id)
    {
        return ResponseEntity.ok(userService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Userinfo> userUpdate(@PathVariable Long id, @RequestBody Userinfo user) 
    {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> userDelete(@PathVariable int id)
    {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
