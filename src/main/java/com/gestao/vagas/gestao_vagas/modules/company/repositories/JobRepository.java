package com.gestao.vagas.gestao_vagas.modules.company.repositories;

import java.util.List;
import java.util.UUID;

import com.gestao.vagas.gestao_vagas.modules.company.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
    List<JobEntity> findByDescriptionContainingIgnoreCase(String title);

    List<JobEntity> findByCompanyId(UUID companyId);
}