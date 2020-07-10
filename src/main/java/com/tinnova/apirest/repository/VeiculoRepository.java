package com.tinnova.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tinnova.apirest.datasource.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
