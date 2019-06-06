package com.example.demo.services.impl;

import com.example.demo.entities.VersionEntity;
import com.example.demo.repositories.VersionRepository;
import com.example.demo.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionServiceImpl implements VersionService {

    private final VersionRepository versionRepository;

    @Autowired
    public VersionServiceImpl(VersionRepository versionRepository) {
        this.versionRepository = versionRepository;
    }

    @Override
    public List<VersionEntity> getVersion() {
        return versionRepository.findAll();
    }

    @Override
    public VersionEntity findById(Integer id) {
        return versionRepository.findById(id).get();
    }

    @Override
    public VersionEntity saveVersion(Integer id, VersionEntity versionEntity) {
        return versionRepository.save(versionEntity);
    }

    @Override
    public void deleteVersion(Integer id) {
        versionRepository.deleteById(id);
    }
}
