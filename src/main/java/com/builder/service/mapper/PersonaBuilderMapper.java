package com.builder.service.mapper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.builder.domain.Persona;
import com.builder.service.builder.PersonaBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/*
 * El mapper define en metodos estaticos diferentes representaciones 
 * de lo que se intentará moestrar o transportar hacia el cliente siempre y cuando no sea nulo.
 */
public class PersonaBuilderMapper {
	
	public static PersonaBuilder map1(Persona persona) {
		PersonaBuilder personaBuilder=new PersonaBuilder
											.Builder()
											.setNombre(persona.getNombre())
											.setApellidoPaterno(persona.getApellidoPaterno())
											.setAppellidoMaterno(persona.getApellidoMaterno())
											.build();
		return personaBuilder;
	}
	
	public static List<PersonaBuilder> map2 (Stream<Persona> personas){
		List<PersonaBuilder> personasBuilder= personas.map(persona->new PersonaBuilder.Builder()
												.setNombre(persona.getNombre())
												.setAppellidoMaterno(persona.getApellidoMaterno())
												.setApellidoPaterno(persona.getApellidoPaterno())
												.build()
												).collect(Collectors.toList());
		return personasBuilder;
	}

}
