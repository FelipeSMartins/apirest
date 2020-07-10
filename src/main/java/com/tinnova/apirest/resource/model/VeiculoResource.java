package com.tinnova.apirest.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VeiculoResource {
	
	@JsonProperty("id_veiculo")
	private long id;
	@JsonProperty("tipo_veiculo")
	private String veiculo;
	@JsonProperty("ano_veiculo")
	private int ano;
	@JsonProperty("marca_veiculo")
	private String marca;
	
	public VeiculoResource(long id, String veiculo, int ano, String marca) {
		this.id = id;
		this.veiculo = veiculo;
		this.ano = ano;
		this.marca = marca;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
	

}
