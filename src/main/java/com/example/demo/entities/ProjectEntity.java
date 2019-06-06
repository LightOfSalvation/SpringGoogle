package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "project")
@Entity(name = "Project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer project_id;

    @Basic
    @Column(name = "project_name", length = 50)
    private String project_name;

    @Basic
    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Basic
    @Column(name = "updated_at")
    private LocalDateTime updated_at;


}
