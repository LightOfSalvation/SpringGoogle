package com.example.demo.controllers;

import com.example.demo.entities.RoleEntity;
import com.example.demo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<RoleEntity>> getRoles(){
        return ResponseEntity.ok(roleService.getRole());
    }

    @GetMapping("/{id}")
    public RoleEntity findById(@PathVariable("id") Integer id) {
        return roleService.findById(id);
    }

    @PostMapping
    public RoleEntity createRole(@RequestBody @Valid RoleEntity roleEntity) {
        return saveRole(null, roleEntity);
    }

    @PutMapping("/{id}")
    public RoleEntity updateRole(@PathVariable("id") Integer id, @RequestBody @Valid RoleEntity roleEntity) {
        return saveRole(id, roleEntity);
    }

    private RoleEntity saveRole(Integer id, RoleEntity editionEntity){
        return roleService.saveRole(id, editionEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable("id") Integer id) {
        roleService.deleteRole(id);
    }

}
