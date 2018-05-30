package com.builder.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.builder.service.PersonaService;
import com.builder.service.builder.PersonaBuilder;

@RestController
public class PersonaResource {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("persona/{id}")
	public PersonaBuilder findById(@PathVariable(value="id") Long id) {
		return personaService.findById(id);
	}
	
	@GetMapping("personas/{nombre}")
	public List<PersonaBuilder> findByNombre(@PathVariable(value="nombre") String nombre) {
		return personaService.findByNombre(nombre);
	}

}
