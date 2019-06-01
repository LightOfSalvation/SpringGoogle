package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "DocumentFile")
@Table(name = "DocumentFile")
public class DocumentFileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "fileUrl", length = 255)
    private String fileUrl;

}
