package com.estacionamento.beca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.beca.model.Veiculo;
import com.estacionamento.beca.repository.VeiculoRepository;
@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	public Veiculo salvarVeiculo(Veiculo veiculo) {

		veiculoRepository.save(veiculo);//primeiro o cliente get e  set 
		return veiculo;

	}

}
