package com.example.demo.repositories;

import com.example.demo.entities.DocumentFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentFileRepository extends JpaRepository<DocumentFileEntity, Integer> {

}
