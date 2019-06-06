package com.example.demo.controllers;

import com.example.demo.entities.ProjectEntity;
import com.example.demo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public ResponseEntity<List<ProjectEntity>> getProjects(){
        return ResponseEntity.ok(projectService.getProject());
    }

    @GetMapping("/{id}")
    public ProjectEntity findById(@PathVariable("id") Integer id) {
        return projectService.findById(id);
    }

    @PostMapping
    public ProjectEntity createProject(@RequestBody @Valid ProjectEntity projectEntity) {
        return saveProject(null, projectEntity);
    }

    @PutMapping("/{id}")
    public ProjectEntity updateProject(@PathVariable("id") Integer id, @RequestBody @Valid ProjectEntity projectEntity) {
        return saveProject(id, projectEntity);
    }

    private ProjectEntity saveProject(Integer id, ProjectEntity editionEntity){
        return projectService.saveProject(id, editionEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable("id") Integer id) {
        projectService.deleteProject(id);
    }

}
