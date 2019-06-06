package com.example.demo.controllers;

import com.example.demo.entities.EditionEntity;
import com.example.demo.services.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/editions")
public class EditionController {

    private final EditionService editionService;

    @Autowired
    public EditionController(EditionService editionService) {
        this.editionService = editionService;
    }

    @GetMapping
    public ResponseEntity<List<EditionEntity>> getEditions(){
        return ResponseEntity.ok(editionService.getEdition());
    }

    @GetMapping("/{id}")
    public EditionEntity findById(@PathVariable("id") Integer id) {
        return editionService.findById(id);
    }

    @PostMapping
    public EditionEntity createEdition(@RequestBody @Valid EditionEntity editionEntity) {
        return saveEdition(null, editionEntity);
    }

    @PutMapping("/{id}")
    public EditionEntity updateEdition(@PathVariable("id") Integer id, @RequestBody @Valid EditionEntity editionEntity) {
        return saveEdition(id, editionEntity);
    }

    private EditionEntity saveEdition(Integer id, EditionEntity editionEntity){
        return editionService.saveEdition(id, editionEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEdition(@PathVariable("id") Integer id) {
        editionService.deleteEdition(id);
    }

}
