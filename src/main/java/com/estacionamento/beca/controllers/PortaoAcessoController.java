package com.estacionamento.beca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estacionamento.beca.model.PortaoAcesso;
import com.estacionamento.beca.service.PortaoAcessoService;

@RestController
@RequestMapping("/api")
public class PortaoAcessoController {

	@Autowired
	private PortaoAcessoService portaoAcessoService;

	@PostMapping("/entrouNaVaga")
	public PortaoAcesso entrouNaVaga(PortaoAcesso portaoAcesso) {
		portaoAcessoService.entrouNaVaga(portaoAcesso);
		return portaoAcesso;
	}
	
	@RequestMapping("/saiuDaVaga")
	public PortaoAcesso saiuDaVaga(PortaoAcesso portaoAcesso) {
		return portaoAcessoService.saiuDaVaga(portaoAcesso);
	}

}
