package com.example.minicurso.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.minicurso.models.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long>{

	@Query(value = "SELECT * FROM professor WHERE salario > ?1", nativeQuery = true)
	public List<Professor> listarProfessoresPorSalario(Long salario);
}
