package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "email", length = 50)
    private String email;

    @Basic
    @Column(name = "name", length = 50)
    private String name;

    @Basic
    @Column(name = "password", length = 50)
    private String password;

}
