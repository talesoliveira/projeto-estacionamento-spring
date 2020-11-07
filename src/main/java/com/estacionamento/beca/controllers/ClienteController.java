package com.estacionamento.beca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estacionamento.beca.model.Cliente;
import com.estacionamento.beca.service.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("/salvarCliente")
	public Cliente salvarCliente(Cliente cliente) {
		clienteService.salvarCliente(cliente);
		return cliente;
	}

}
