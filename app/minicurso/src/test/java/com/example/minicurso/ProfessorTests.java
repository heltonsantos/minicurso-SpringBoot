package com.example.minicurso;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.minicurso.models.Departamento;
import com.example.minicurso.models.Professor;
import com.example.minicurso.repositories.ProfessorRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfessorTests {
	
	@Autowired
	ProfessorRepository repository;

	@Test
	public void buscarProfessor() {
		Professor professor = repository.findOne(new Long(1));
		
		assertEquals("Maria", professor.getNome());
		assertEquals(4, professor.getAulas().size());
	}
	
	@Test
	public void salvarProfessor() {
		Professor professor = new Professor();
		professor.setNome("Fulano");
		professor.setCpf("00011122233");
		professor.setCategoria("Titular");
		professor.setSalario(new Long(2000));
		
		Departamento departamento = new Departamento();
		departamento.setId(new Long(1));
		professor.setDepartamento(departamento);
		
		repository.save(professor);
	}
	
	@Test
	public void buscarProfessorPorSalario() {
		List<Professor> professores = repository.listarProfessoresPorSalario(new Long(1500));
	
	}
}
