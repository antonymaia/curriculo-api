package br.antony.curriculo.services;

import br.antony.curriculo.models.CurriculoModel;
import br.antony.curriculo.models.ExpProfissionalModel;
import br.antony.curriculo.repositories.CurriculoRepository;
import br.antony.curriculo.repositories.ExpProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CurriculoRepository curriculoRepository;
    @Autowired
    private ExpProfissionalRepository profissionalRepository;

    public void dbInstance(){

        CurriculoModel curriculo1 = new CurriculoModel();
        curriculo1.setNome("Antony Maia");
        curriculo1.setPosicaoPretendida("Desenvolvedor Java");
        curriculo1.setEmail("antony@gmail.com");
        curriculo1.setTelefone("(81)986553732");
        curriculo1.setLinkLinkedin("linkedin.com/antony");
        curriculo1 = curriculoRepository.save(curriculo1);

        CurriculoModel curriculo2 = new CurriculoModel();
        curriculo2.setNome("Maria Maia");
        curriculo2.setPosicaoPretendida("Dev Front-end");
        curriculo2.setEmail("maria@gmail.com");
        curriculo2.setTelefone("(81)986559999");
        curriculo2.setLinkLinkedin("linkedin.com/maria");
        curriculo2 = curriculoRepository.save(curriculo2);

        ExpProfissionalModel expProfissional1 = new ExpProfissionalModel();
        expProfissional1.setNomeEmpresa("Autech");
        expProfissional1.setDataAdmissao(LocalDate.of(2020, 12, 10));
        expProfissional1.setDataDemissao(LocalDate.of(2021, 10, 15));
        expProfissional1.setFuncao("Desenvolver Software");
        expProfissional1.setCurriculo(curriculo1);
        expProfissional1 = profissionalRepository.save(expProfissional1);

        ExpProfissionalModel expProfissional2 = new ExpProfissionalModel();
        expProfissional2.setNomeEmpresa("Lifery");
        expProfissional2.setDataAdmissao(LocalDate.of(2019, 10, 22));
        expProfissional2.setDataDemissao(LocalDate.of(2020, 11, 25));
        expProfissional2.setFuncao("Desenvolver Software");
        expProfissional2.setCurriculo(curriculo2);
        expProfissional2 = profissionalRepository.save(expProfissional2);
    }
}
