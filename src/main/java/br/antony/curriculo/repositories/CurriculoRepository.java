package br.antony.curriculo.repositories;

import br.antony.curriculo.models.CurriculoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurriculoRepository extends JpaRepository<CurriculoModel, UUID> {
}
