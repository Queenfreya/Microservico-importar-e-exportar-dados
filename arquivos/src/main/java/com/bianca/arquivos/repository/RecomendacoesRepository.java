package com.bianca.arquivos.repository;

import com.bianca.arquivos.entity.RecomendacoesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RecomendacoesRepository extends JpaRepository<RecomendacoesEntity, UUID> {
    List<RecomendacoesEntity> findByUsuarioId(UUID id);


}
