package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "version")
@Entity(name = "Version")
public class VersionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "version_id")
    private Integer version_id;

    @Basic
    @Column(name = "version_title", length = 50)
    private String version_title;

    @Basic
    @Column(name = "version_description", length = 50)
    private String version_description;

    @Basic
    @Column(name = "attachment", length = 50)
    private String attachment;

    @Basic
    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Basic
    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @Basic
    @Column(name = "deleted_at")
    private LocalDateTime deleted_at;

    @Basic
    @Column(name = "release_plan")
    private LocalDateTime release_plan;

}
