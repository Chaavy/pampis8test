package com.first.api.TEST_API.dataSource.repository;

import com.first.api.TEST_API.dataSource.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
