package com.example.bs_user_management_v1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.model.dto.UserResponse;
import com.example.bs_user_management_v1.model.entity.UserEntity;
import com.example.bs_user_management_v1.repository.UserRepository;
import com.example.bs_user_management_v1.service.UserService;
import com.example.bs_user_management_v1.util.MapearUserUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserRequest userRequest){
        var user = UserEntity.builder()
            .nombres(userRequest.getNombres())
            .apellidos(userRequest.getApellidos())
            .edad(userRequest.getEdad()).build();

        log.info("User added: {}"+user);
        userRepository.save(user);
    }

    public List<UserResponse> getAllUsers(){
        var users = userRepository.findAll();

        return MapearUserUtil.toListUserResponse(users);
    }

}
