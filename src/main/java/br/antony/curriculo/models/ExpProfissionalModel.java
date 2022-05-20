package br.antony.curriculo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_EXPERIENCIA_PROFISSIONAL")
public class ExpProfissionalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nomeEmpresa;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;
    private String funcao;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    @JsonIgnore
    private CurriculoModel curriculo;
}
