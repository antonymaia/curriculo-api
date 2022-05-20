package br.antony.curriculo.controllers;

import br.antony.curriculo.models.CurriculoModel;
import br.antony.curriculo.services.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("curriculo")
public class CurriculoController {

    @Autowired
    public CurriculoService curriculoService;

    @PostMapping
    public ResponseEntity<CurriculoModel> save(@RequestBody CurriculoModel curriculoModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(curriculoService.save(curriculoModel));
    }

    @GetMapping
    public ResponseEntity<List<CurriculoModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(curriculoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CurriculoModel> findById(@PathVariable("id")UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(curriculoService.findById(id));
    }

}
