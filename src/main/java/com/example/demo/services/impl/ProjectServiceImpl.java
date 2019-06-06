package com.example.demo.services.impl;

import com.example.demo.entities.ProjectEntity;
import com.example.demo.repositories.ProjectRepository;
import com.example.demo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<ProjectEntity> getProject() {
        return projectRepository.findAll();
    }

    @Override
    public ProjectEntity findById(Integer id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public ProjectEntity saveProject(Integer id, ProjectEntity projectEntity) {
        return projectRepository.save(projectEntity);
    }

    @Override
    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);
    }
}
