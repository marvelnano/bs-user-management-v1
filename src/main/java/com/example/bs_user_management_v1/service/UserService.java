package com.example.bs_user_management_v1.service;

import java.util.List;

import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.model.dto.UserResponse;

public interface UserService {
    
    public void addUser(UserRequest userRequest);
    public List<UserResponse> getAllUsers();

}
