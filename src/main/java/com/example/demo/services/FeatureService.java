package com.example.demo.services;

import com.example.demo.entities.FeatureEntity;

import java.util.List;

public interface FeatureService {

    List<FeatureEntity> getFeature();

    FeatureEntity findById(Integer id);

    FeatureEntity saveFeature(Integer id, FeatureEntity featureEntity);

    void deleteFeature(Integer id);
}
