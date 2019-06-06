package com.example.demo.services;

import com.example.demo.entities.RoleEntity;

import java.util.List;

public interface RoleService {

    List<RoleEntity> getRole();

    RoleEntity findById(Integer id);

    RoleEntity saveRole(Integer id, RoleEntity roleEntity);

    void deleteRole(Integer id);

}
