package com.tinnova.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tinnova.apirest.datasource.model.Veiculo;
import com.tinnova.apirest.repository.VeiculoRepository;

public class CadastroVeiculo {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public void cadastro(Veiculo veiculo) {
		veiculoRepository.saveAndFlush(veiculo);
	}
}
