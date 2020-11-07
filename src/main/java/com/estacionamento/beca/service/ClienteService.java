package com.estacionamento.beca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.beca.model.Cliente;
import com.estacionamento.beca.repository.ClienteRepository;
@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository; 
	
	
	public Cliente salvarCliente(Cliente cliente) {
		
		clienteRepository.save(cliente);
		return cliente;
		
	}

}
