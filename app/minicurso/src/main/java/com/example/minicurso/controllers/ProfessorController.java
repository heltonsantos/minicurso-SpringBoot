package com.example.minicurso.controllers;

import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.minicurso.models.Professor;
import com.example.minicurso.repositories.ProfessorRepository;

@Controller
@RequestMapping(path="/professor")
public class ProfessorController {
	
	@Autowired
	ProfessorRepository professorRepository;
	
	@GetMapping(path="/getBuscarPorId")
	public @ResponseBody Professor getBuscarPorId(@RequestParam(value="professor_id") Long professor_id) throws JSONException{
		Professor professor =  professorRepository.findOne(professor_id);
		return professor;
	}
	
	@PostMapping(path="/postBuscarPorId")
	public @ResponseBody Professor postBuscarPorId(@RequestBody String professor_id) throws JSONException{
		Professor professor =  professorRepository.findOne(Long.parseLong(professor_id));
		return professor;
	}
	
	@PostMapping(path="/listar")
	public @ResponseBody List<Professor> listar() throws JSONException{
		List<Professor> lista =  (List<Professor>) professorRepository.findAll();
		return lista;
	}
	
	@PostMapping(path="/salvar")
	public @ResponseBody Professor postBuscarPorId(@RequestBody Professor professor) throws JSONException{
		Professor professorSalvo =  professorRepository.save(professor);
		return professorSalvo;
	}

}
