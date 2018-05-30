package com.builder.service;

import java.util.List;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.builder.domain.Persona;
import com.builder.repository.PersonaRepository;
import com.builder.service.builder.PersonaBuilder;
import com.builder.service.mapper.PersonaBuilderMapper;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	
	public PersonaBuilder findById(Long id) {
		Persona persona=personaRepository.findById(id).get();
		return PersonaBuilderMapper.map1(persona);
	}
	
	public List<PersonaBuilder> findByNombre(String nombre){
		Stream<Persona> personas=personaRepository.findByNombre(nombre).stream();
		return PersonaBuilderMapper.map2(personas);
	}
	
	@PostConstruct
	private void fakemock() {
		Persona persona=new Persona();
		persona.setNombre("Ignacio");
		persona.setApellidoPaterno("Jeria");
		persona.setApellidoMaterno(null);
		
		Persona persona2= new Persona();
		persona2.setNombre("Ignacio");
		persona2.setApellidoPaterno("Jeria");
		persona2.setApellidoMaterno("Garrido");
		
		personaRepository.save(persona);
		personaRepository.save(persona2);
	}
}
