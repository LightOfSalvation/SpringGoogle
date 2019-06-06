package com.example.demo.entities;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "feature")
@Entity(name = "Feature")
public class FeatureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feature_id")
    private Integer feature_id;

    @Basic
    @Column(name = "feature_title", length = 50)
    private String feature_title;

    @Basic
    @Column(name = "feature_description", length = 50)
    private String feature_description;

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
