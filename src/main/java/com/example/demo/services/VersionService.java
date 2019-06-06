package com.example.demo.services;

import com.example.demo.entities.VersionEntity;

import java.util.List;

public interface VersionService {

    List<VersionEntity> getVersion();

    VersionEntity findById(Integer id);

    VersionEntity saveVersion(Integer id, VersionEntity versionEntity);

    void deleteVersion(Integer id);

}
