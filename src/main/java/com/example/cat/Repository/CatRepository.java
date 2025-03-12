package com.example.cat.Repository;

import com.example.cat.Entity.CatEntity;
import com.example.cat.Entity.DiseaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CatRepository extends JpaRepository<CatEntity, Long> {
    Optional<CatEntity> findByName(String name);
    List<CatEntity> findCatEntitiesByDiseaseNotNull();
}
