package com.example.bs_user_management_v1.util;

import java.util.List;

import com.example.bs_user_management_v1.model.dto.UserResponse;
import com.example.bs_user_management_v1.model.entity.UserEntity;

public class MapearUserUtil {

    MapearUserUtil(){

    }

    public static List<UserResponse> toListUserResponse(List<UserEntity> users){
        
        return users.stream().map(l -> UserResponse.builder()
            .id(l.getId())
            .nombres(l.getNombres())
            .apellidos(l.getApellidos())
            .edad(l.getEdad()).build())
        .toList();

    }

}
