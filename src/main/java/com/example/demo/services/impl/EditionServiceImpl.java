package com.example.demo.services.impl;

import com.example.demo.entities.EditionEntity;
import com.example.demo.repositories.EditionRepository;
import com.example.demo.services.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditionServiceImpl implements EditionService {

    private final EditionRepository editionRepository;

    @Autowired
    public EditionServiceImpl(EditionRepository editionRepository) {
        this.editionRepository = editionRepository;
    }

    @Override
    public List<EditionEntity> getEdition() {
        return editionRepository.findAll();
    }

    @Override
    public EditionEntity findById(Integer id) {
        return editionRepository.findById(id).get();
    }

    @Override
    public EditionEntity saveEdition(Integer id, EditionEntity editionEntity) {
        return editionRepository.save(editionEntity);
    }

    @Override
    public void deleteEdition(Integer id) {
        editionRepository.deleteById(id);
    }
}
