package com.example.demo.services.impl;

import com.example.demo.entities.FeatureEntity;
import com.example.demo.repositories.FeatureRepository;
import com.example.demo.services.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureServiceImpl implements FeatureService {

    private final FeatureRepository featureRepository;

    @Autowired
    public FeatureServiceImpl(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    @Override
    public List<FeatureEntity> getFeature() {
        return featureRepository.findAll();
    }

    @Override
    public FeatureEntity findById(Integer id) {
        return featureRepository.findById(id).get();
    }

    @Override
    public FeatureEntity saveFeature(Integer id, FeatureEntity featureEntity) {
        return featureRepository.save(featureEntity);
    }

    @Override
    public void deleteFeature(Integer id) {
        featureRepository.deleteById(id);
    }
}
