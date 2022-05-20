package br.antony.curriculo.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class ExpProfissionalDto {

    private String nomeEmpresa;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;
    private String funcao;
    private UUID curriculoId;
}
