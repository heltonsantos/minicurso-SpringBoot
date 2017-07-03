package com.example.minicurso.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.minicurso.models.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long>{

}
