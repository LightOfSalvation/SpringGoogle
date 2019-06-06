package com.example.demo.controllers;

import com.example.demo.entities.FeatureEntity;
import com.example.demo.services.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/features")
public class FeatureController {

    private final FeatureService featureService;

    @Autowired
    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping
    public ResponseEntity<List<FeatureEntity>> getFeatures(){
        return ResponseEntity.ok(featureService.getFeature());
    }

    @GetMapping("/{id}")
    public FeatureEntity findById(@PathVariable("id") Integer id) {
        return featureService.findById(id);
    }

    @PostMapping
    public FeatureEntity createFeature(@RequestBody @Valid FeatureEntity featureEntity) {
        return saveFeature(null, featureEntity);
    }

    @PutMapping("/{id}")
    public FeatureEntity updateFeature(@PathVariable("id") Integer id, @RequestBody @Valid FeatureEntity featureEntity) {
        return saveFeature(id, featureEntity);
    }

    private FeatureEntity saveFeature(Integer id, FeatureEntity featureEntity){
        return featureService.saveFeature(id, featureEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteFeature(@PathVariable("id") Integer id) {
        featureService.deleteFeature(id);
    }

}
