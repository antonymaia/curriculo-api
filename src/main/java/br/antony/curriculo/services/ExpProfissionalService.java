package br.antony.curriculo.services;

import br.antony.curriculo.models.ExpProfissionalModel;
import br.antony.curriculo.repositories.ExpProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpProfissionalService {

    @Autowired
    private ExpProfissionalRepository expProdissionalRepository;

    @Autowired
    private CurriculoService curriculoService;

    public ExpProfissionalModel save(ExpProfissionalModel expProfissionalModel) {
        expProfissionalModel.setCurriculo(
                curriculoService.findById(expProfissionalModel.getCurriculo().getId()));
        return expProdissionalRepository.save(expProfissionalModel);
    }
}
