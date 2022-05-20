package br.antony.curriculo.services;

import br.antony.curriculo.models.CurriculoModel;
import br.antony.curriculo.repositories.CurriculoRepository;
import br.antony.curriculo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.UUID;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public CurriculoModel save(CurriculoModel curriculoModel) {
        return curriculoRepository.save(curriculoModel);
    }

    public List<CurriculoModel> findAll() {
        return curriculoRepository.findAll();
    }

    public CurriculoModel findById(UUID id) {
        return curriculoRepository.findById(id).orElseThrow(
                ()-> new ObjectNotFoundException("Curriculo não encontrado, ID: "+ id));
    }
}
