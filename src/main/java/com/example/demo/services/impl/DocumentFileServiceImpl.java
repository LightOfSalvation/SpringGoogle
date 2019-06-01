package com.example.demo.services.impl;


import com.example.demo.entities.DocumentFileEntity;
import com.example.demo.repositories.DocumentFileRepository;
import com.example.demo.services.DocumentFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentFileServiceImpl implements DocumentFileService {

    private final DocumentFileRepository documentFileRepository;

    @Autowired
    public DocumentFileServiceImpl(DocumentFileRepository documentFileRepository) {
        this.documentFileRepository = documentFileRepository;
    }

    @Override
    public List<DocumentFileEntity> getDocumentFiles() {
        return documentFileRepository.findAll();
    }

    @Override
    public DocumentFileEntity findById(Integer id) {
        return documentFileRepository.findById(id).get();
    }

    @Override
    public DocumentFileEntity saveUser(Integer id, DocumentFileEntity documentFileEntity) {
        return documentFileRepository.save(documentFileEntity);
    }

    @Override
    public void deleteDocumentFile(Integer id) {
        documentFileRepository.deleteById(id);
    }
}
