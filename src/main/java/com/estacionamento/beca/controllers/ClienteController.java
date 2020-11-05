package com.estacionamento.beca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estacionamento.beca.model.Cliente;
import com.estacionamento.beca.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping
	public @ResponseBody Cliente novoCliente(Cliente cliente) {

		clienteRepository.save(cliente);
		return cliente;
	}

}
