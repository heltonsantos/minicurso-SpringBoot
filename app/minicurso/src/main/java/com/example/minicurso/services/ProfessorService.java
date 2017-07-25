package com.example.minicurso.services;

import com.example.minicurso.models.dto.DepartamentoProfessor;

public interface ProfessorService {
	
	public DepartamentoProfessor retornaProfessorDepartamento(Long id_professor, Long id_departamento);

}
