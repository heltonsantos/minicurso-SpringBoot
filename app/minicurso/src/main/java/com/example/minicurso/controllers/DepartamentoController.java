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

import com.example.minicurso.models.Departamento;
import com.example.minicurso.repositories.DepartamentoRepository;

@Controller
@RequestMapping(path="/departamento")
public class DepartamentoController {
	
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	@GetMapping(path="/getBuscarPorId")
	public @ResponseBody Departamento getBuscarPorId(@RequestParam(value="departamento_id") Long disciplina_id) throws JSONException{
		Departamento departamento =  departamentoRepository.findOne(disciplina_id);
		return departamento;
	}
	
	@PostMapping(path="/postBuscarPorId")
	public @ResponseBody Departamento postBuscarPorId(@RequestBody String disciplina_id) throws JSONException{
		Departamento departamento =  departamentoRepository.findOne(Long.parseLong(disciplina_id));
		return departamento;
	}
	
	@PostMapping(path="/listar")
	public @ResponseBody List<Departamento> listar() throws JSONException{
		List<Departamento> lista =  (List<Departamento>) departamentoRepository.findAll();
		return lista;
	}
	
	@PostMapping(path="/salvar")
	public @ResponseBody Departamento postBuscarPorId(@RequestBody Departamento departamento) throws JSONException{
		Departamento departamentoSalvo =  departamentoRepository.save(departamento);
		return departamentoSalvo;
	}

}
