package com.tinnova.apirest.datasource.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
	
	private static final long serialVersionUID = 2131321311L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column(name = "Caracteristicas")
	String veiculo;
	String marca;
	int ano;
	String descricao;
	boolean vendido;
	Date created;
	Date updated;
	
	@SuppressWarnings("unused")
	private Veiculo() {
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Veiculo(long id, String veiculos, String marca, int ano, String descricao, boolean vendido, Date created,
			Date updated) {
		this.id = id;
		this.veiculo = veiculos;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
		this.created = created;
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "Veiculos [id=" + id + ", veiculo=" + veiculo + ", marca=" + marca + ", ano=" + ano + ", descricao="
				+ descricao + ", vendido=" + vendido + ", created=" + created + ", updated=" + updated + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVeiculos() {
		return veiculo;
	}
	public void setVeiculos(String veiculos) {
		this.veiculo = veiculos;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}	
	
	
	

}
