package com.example.cat.Repository;

import com.example.cat.Entity.DiseaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<DiseaseEntity, Long> {
}
