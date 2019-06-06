package com.example.demo.services.impl;

import com.example.demo.entities.RoleEntity;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleEntity> getRole() {
        return roleRepository.findAll();
    }

    @Override
    public RoleEntity findById(Integer id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public RoleEntity saveRole(Integer id, RoleEntity roleEntity) {
        return roleRepository.save(roleEntity);
    }

    @Override
    public void deleteRole(Integer id) {
        roleRepository.deleteById(id);
    }
}
