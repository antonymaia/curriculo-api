package br.antony.curriculo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CURRICULO")
public class CurriculoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String telefone;
    private String email;
    private String linkLinkedin;
    private String posicaoPretendida;

    @OneToMany(mappedBy = "curriculo")
    @JsonProperty("ExpProfissional")
    private List<ExpProfissionalModel> expProfissionalList;

    public CurriculoModel(UUID id) {
        this.id = id;
    }
}
