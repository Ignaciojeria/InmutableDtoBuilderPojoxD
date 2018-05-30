package com.builder.service.builder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PersonaBuilder {
	
	private PersonaBuilder personaBuilder;

	private Long id;

	private String apellidoPaterno;

	private String apellidoMaterno;

	private String nombre;

	private String numeroDocumento;

	private Boolean soltero;

	private String nacionalidad;
	
	private PersonaBuilder(PersonaBuilder personaBuilder) {
		this.personaBuilder=personaBuilder;
	}
	
	
	private PersonaBuilder() {}
	
	public static class Builder {
		PersonaBuilder persona=new PersonaBuilder();
		
        public Builder setNombre(String nombre) {
            this.persona.nombre = nombre;
            return this; 
        }

        public Builder setAppellidoMaterno(String apellidoMaterno) {
            this.persona.apellidoMaterno= apellidoMaterno;
            return this;
        }
        
    	public Builder setApellidoPaterno(String apellidoPaterno) {
    		this.persona.apellidoPaterno = apellidoPaterno;
    		return this;
    	}
        

        public PersonaBuilder build(){
            return new PersonaBuilder(persona).personaBuilder;
        }
	}
	
	public Long getId() {
		return id;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}



	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public String getNombre() {
		return nombre;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public Boolean getSoltero() {
		return soltero;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public void setSoltero(Boolean soltero) {
		this.soltero = soltero;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
