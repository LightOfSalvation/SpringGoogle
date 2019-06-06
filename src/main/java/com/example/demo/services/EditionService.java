package com.example.demo.services;

import com.example.demo.entities.EditionEntity;

import java.util.List;

public interface EditionService {

    List<EditionEntity> getEdition();

    EditionEntity findById(Integer id);

    EditionEntity saveEdition(Integer id, EditionEntity editionEntity);

    void deleteEdition(Integer id);

}
