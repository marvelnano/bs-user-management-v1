package com.example.bs_user_management_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.model.dto.RespuestaCreadoExito;
import com.example.bs_user_management_v1.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/v1/users")
    RespuestaCreadoExito getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/v1/users")
    RespuestaCreadoExito addUser(@RequestBody UserRequest userRequest) {        
        return userService.addUser(userRequest);
    }

    @PutMapping("/v1/users/{id}")
    RespuestaCreadoExito updateUser(@PathVariable("id") Long idUser,
        @RequestBody UserRequest userRequest) {        
        return userService.updateUser(idUser, userRequest);
    }

    @DeleteMapping("/v1/users/{id}")
    RespuestaCreadoExito deleteUser(@PathVariable("id") Long idUser) {        
        return userService.deleteUser(idUser);
    }
        
}
