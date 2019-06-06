package com.example.demo.controllers;

import com.example.demo.entities.VersionEntity;
import com.example.demo.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/versions")
public class VersionController {

    private final VersionService versionService;

    @Autowired
    public VersionController(VersionService versionService) {
        this.versionService = versionService;
    }

    @GetMapping
    public ResponseEntity<List<VersionEntity>> getProjects(){
        return ResponseEntity.ok(versionService.getVersion());
    }

    @GetMapping("/{id}")
    public VersionEntity findById(@PathVariable("id") Integer id) {
        return versionService.findById(id);
    }

    @PostMapping
    public VersionEntity createVersion(@RequestBody @Valid VersionEntity versionEntity) {
        return saveVersion(null, versionEntity);
    }

    @PutMapping("/{id}")
    public VersionEntity updateVersion(@PathVariable("id") Integer id, @RequestBody @Valid VersionEntity versionEntity) {
        return saveVersion(id, versionEntity);
    }

    private VersionEntity saveVersion(Integer id, VersionEntity versionEntity){
        return versionService.saveVersion(id, versionEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable("id") Integer id) {
        versionService.deleteVersion(id);
    }


}
