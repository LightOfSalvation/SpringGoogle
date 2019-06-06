package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "role")
@Entity(name = "Role")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer role_id;

    @Basic
    @Column(name = "role_name", length = 50)
    private String role_name;

}
