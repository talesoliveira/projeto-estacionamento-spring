package com.estacionamento.beca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estacionamento.beca.model.Setor;
import com.estacionamento.beca.service.SetorService;

@RestController
@RequestMapping("/api")
public class SetorController {

	@Autowired
	private SetorService setorService;

	@PostMapping("/salvaSetor")
	public Setor salvaSetor(Setor setor) {
		setorService.salvaSetor(setor);
		return setor;
	}

}
