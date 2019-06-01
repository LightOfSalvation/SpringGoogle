package com.example.demo.services;


import com.example.demo.entities.DocumentFileEntity;

import java.util.List;

public interface DocumentFileService {

    List<DocumentFileEntity> getDocumentFiles();

    DocumentFileEntity findById(Integer id);

    DocumentFileEntity saveUser(Integer id, DocumentFileEntity documentFileEntity);

    void deleteDocumentFile(Integer id);

}
