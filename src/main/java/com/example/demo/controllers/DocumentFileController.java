package com.example.demo.controllers;

import com.example.demo.entities.DocumentFileEntity;
import com.example.demo.services.DocumentFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/documentFile")
public class DocumentFileController {

    private DocumentFileService documentFileService;

    @Autowired
    public DocumentFileController(DocumentFileService documentFileService) {
        this.documentFileService = documentFileService;
    }

    @GetMapping
    public ResponseEntity<List<DocumentFileEntity>> getDocumentFiles(){
        return ResponseEntity.ok(documentFileService.getDocumentFiles());
    }

    @GetMapping("/{id}")
    public DocumentFileEntity findById(@PathVariable("id") Integer id) {
        return documentFileService.findById(id);
    }

    @PostMapping
    public DocumentFileEntity createDocumentFile(@RequestBody @Valid DocumentFileEntity documentFileEntity) {
        return saveDocumentFile(null, documentFileEntity);
    }

    @PutMapping("/{id}")
    public DocumentFileEntity updateDocumentFile(@PathVariable("id") Integer id,
                                         @RequestBody @Valid DocumentFileEntity documentFileEntity) {
        return saveDocumentFile(id, documentFileEntity);
    }

    private DocumentFileEntity saveDocumentFile(Integer id, DocumentFileEntity userEntity){
        return documentFileService.saveUser(id, userEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentFile(@PathVariable("id") Integer id) {
        documentFileService.deleteDocumentFile(id);
    }

}
