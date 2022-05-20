package br.antony.curriculo.controllers;

import br.antony.curriculo.dtos.ExpProfissionalDto;
import br.antony.curriculo.models.CurriculoModel;
import br.antony.curriculo.models.ExpProfissionalModel;
import br.antony.curriculo.services.ExpProfissionalService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exp")
public class ExpProfissionalController {

    @Autowired
    private ExpProfissionalService expProfissionalService;

    @PostMapping
    public ResponseEntity<ExpProfissionalModel> save(@RequestBody ExpProfissionalDto expProfissionalDto){
        ExpProfissionalModel expProfissionalModel = new ExpProfissionalModel();
        BeanUtils.copyProperties(expProfissionalDto, expProfissionalModel);
        expProfissionalModel.setCurriculo(new CurriculoModel(expProfissionalDto.getCurriculoId()));
        expProfissionalModel = expProfissionalService.save(expProfissionalModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(expProfissionalModel);
    }
}
