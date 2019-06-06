package com.example.demo.repositories;

import com.example.demo.entities.FeatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<FeatureEntity, Integer> {

}
