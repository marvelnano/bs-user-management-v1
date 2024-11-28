package com.example.bs_user_management_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.model.dto.RespuestaCreadoExito;
import com.example.bs_user_management_v1.service.UserService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController implements UserApi{

    @Autowired
    UserService userService;

    @Override
    public RespuestaCreadoExito getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public RespuestaCreadoExito addUser(@RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }

    @Override
    public RespuestaCreadoExito updateUser(@PathVariable("id") Long idUser,
        @RequestBody UserRequest userRequest) {        
        return userService.updateUser(idUser, userRequest);
    }

    @Override
    public RespuestaCreadoExito deleteUser(@PathVariable("id") Long idUser) {
        return userService.deleteUser(idUser);
    }

}
