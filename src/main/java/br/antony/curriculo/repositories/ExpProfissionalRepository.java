package br.antony.curriculo.repositories;

import br.antony.curriculo.models.ExpProfissionalModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExpProfissionalRepository extends JpaRepository<ExpProfissionalModel, UUID> {
}
