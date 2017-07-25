package com.example.minicurso.models.dto;

import com.example.minicurso.models.Departamento;
import com.example.minicurso.models.Professor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartamentoProfessor {
	
	private Departamento departamento;
	private Professor professor;
	
	public DepartamentoProfessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	

}
