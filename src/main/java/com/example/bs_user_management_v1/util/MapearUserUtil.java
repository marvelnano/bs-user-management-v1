package com.example.bs_user_management_v1.util;

import java.util.List;

import com.example.bs_user_management_v1.model.dto.UserRequest;
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

    public static UserEntity toUserEntity(UserRequest body) {

		return UserEntity.builder()
        .nombres(body.getNombres() != null ? body.getNombres() : null)
        .apellidos(body.getApellidos() != null ? body.getApellidos() : null)
        .edad(body.getEdad() != null ? body.getEdad() : null)
        .build();
        
	}

}
