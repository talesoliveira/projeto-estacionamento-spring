package com.estacionamento.beca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estacionamento.beca.model.Veiculo;
import com.estacionamento.beca.service.VeiculoService;

/*antes de cadastrar um veiculo
cadastrar um cliente, depois cadastrar veiculo passando o id*/

@RestController
@RequestMapping("/api")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@PostMapping("/salvarVeiculo")
	public Veiculo salvarVeiculo(Veiculo veiculo) {
		veiculoService.salvarVeiculo(veiculo);
		return veiculo;
	}

}
