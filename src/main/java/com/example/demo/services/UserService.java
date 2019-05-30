package com.example.demo.services;

import com.example.demo.entities.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getUsers();

    UserEntity findById(Integer id);

    UserEntity saveUser(Integer id, UserEntity userEntity);

    void deleteUser(Integer id);

}
