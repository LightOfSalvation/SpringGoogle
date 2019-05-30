package com.example.demo.controllers;

import com.example.demo.entities.UserEntity;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/{id}")
    public UserEntity findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @PostMapping
    public UserEntity createUser(@RequestBody @Valid UserEntity userEntity) {
        return saveUser(null, userEntity);
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable("id") Integer id, @RequestBody @Valid UserEntity userEntity) {
        return saveUser(id, userEntity);
    }

    private UserEntity saveUser(Integer id, UserEntity userEntity){
        return userService.saveUser(id, userEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }

}
