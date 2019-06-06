package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "DocumentFile")
@Table(name = "document_file")
public class DocumentFileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "image_name", length = 50)
    private String image_name;

    @Basic
    @Column(name = "file_url", length = 255)
    private String file_url;

}
