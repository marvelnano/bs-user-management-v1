package com.example.bs_user_management_v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bs_user_management_v1.model.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
