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

import com.example.minicurso.models.Disciplina;
import com.example.minicurso.repositories.DisciplinaRepository;

@Controller
@RequestMapping(path="/disciplina")
public class DisciplinaController {
	
	@Autowired
	DisciplinaRepository disciplinaRepository;
	
	@GetMapping(path="/getBuscarPorId")
	public @ResponseBody Disciplina getBuscarPorId(@RequestParam(value="disciplina_id") Long disciplina_id) throws JSONException{
		Disciplina disciplina =  disciplinaRepository.findOne(disciplina_id);
		return disciplina;
	}
	
	@PostMapping(path="/postBuscarPorId")
	public @ResponseBody Disciplina postBuscarPorId(@RequestBody String disciplina_id) throws JSONException{
		Disciplina disciplina =  disciplinaRepository.findOne(Long.parseLong(disciplina_id));
		return disciplina;
	}
	
	@PostMapping(path="/listar")
	public @ResponseBody List<Disciplina> listar() throws JSONException{
		List<Disciplina> lista =  (List<Disciplina>) disciplinaRepository.findAll();
		return lista;
	}
	
	@PostMapping(path="/salvar")
	public @ResponseBody Disciplina postBuscarPorId(@RequestBody Disciplina disciplina) throws JSONException{
		Disciplina disciplinaSalva =  disciplinaRepository.save(disciplina);
		return disciplinaSalva;
	}

}
