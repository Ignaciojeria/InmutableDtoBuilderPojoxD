package com.builder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.builder.domain.Persona;
import java.lang.String;
import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
	List<Persona> findByNombre(String nombre);
}
