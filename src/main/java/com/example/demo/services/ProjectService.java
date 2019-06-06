package com.example.demo.services;

import com.example.demo.entities.ProjectEntity;

import java.util.List;

public interface ProjectService {

    List<ProjectEntity> getProject();

    ProjectEntity findById(Integer id);

    ProjectEntity saveProject(Integer id, ProjectEntity projectEntity);

    void deleteProject(Integer id);

}
