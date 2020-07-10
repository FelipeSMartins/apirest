package com.tinnova.apirest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinnova.apirest.datasource.model.Veiculo;
import com.tinnova.apirest.repository.VeiculoRepository;

@RestController
@RequestMapping(value = "/api")
public class VeiculoController {
	
	private VeiculoRepository veiculoRepository;
	
	@GetMapping(path = "/veiculo")
	public List<Veiculo> buscarVeiculo(){
		return veiculoRepository.findAll();
	}

}
