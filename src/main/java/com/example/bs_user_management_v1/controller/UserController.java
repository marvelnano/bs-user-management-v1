package com.example.bs_user_management_v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.model.dto.UserResponse;
import com.example.bs_user_management_v1.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/v1/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody UserRequest userRequest) {        
        this.userService.addUser(userRequest);
    }

    @GetMapping("/v1/users")
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }
    
    
}
