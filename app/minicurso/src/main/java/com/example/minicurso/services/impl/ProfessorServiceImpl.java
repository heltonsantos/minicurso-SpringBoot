package com.example.minicurso.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.minicurso.models.Departamento;
import com.example.minicurso.models.Professor;
import com.example.minicurso.models.dto.DepartamentoProfessor;
import com.example.minicurso.repositories.DepartamentoRepository;
import com.example.minicurso.repositories.ProfessorRepository;
import com.example.minicurso.services.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService{
	
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	@Autowired
	ProfessorRepository professorRepository;

	@Override
	public DepartamentoProfessor retornaProfessorDepartamento(Long id_professor, Long id_departamento) {
		DepartamentoProfessor departamentoProfessor = new DepartamentoProfessor();
		
		Departamento departamento = departamentoRepository.findOne(id_departamento);
		Professor professor = professorRepository.findOne(id_professor);
		
		departamento.setProfessores(null);
		
		departamentoProfessor.setDepartamento(departamento);
		departamentoProfessor.setProfessor(professor);
		
		
		
		return departamentoProfessor;
	}

}
