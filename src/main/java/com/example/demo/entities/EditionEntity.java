package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "edition")
@Entity(name = "Edition")
public class EditionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edition_id")
    private Integer edition_id;

    @Basic
    @Column(name = "edition_title", length = 50)
    private String edition_title;

    @Basic
    @Column(name = "edition_description", length = 50)
    private String edition_description;

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
    @Column(name = "release_day")
    private LocalDateTime release_day;

}
