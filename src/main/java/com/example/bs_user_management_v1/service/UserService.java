package com.example.bs_user_management_v1.service;

import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.model.dto.RespuestaCreadoExito;

public interface UserService {
    
    public RespuestaCreadoExito getAllUsers();
    public RespuestaCreadoExito addUser(UserRequest userRequest);
    public RespuestaCreadoExito updateUser(Long idUser, UserRequest userRequest);
    public RespuestaCreadoExito deleteUser(Long idUser);

}
