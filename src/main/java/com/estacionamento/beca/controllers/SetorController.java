package com.estacionamento.beca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estacionamento.beca.model.Setor;
import com.estacionamento.beca.repository.SetorRepository;

@RestController
@RequestMapping("/api/setor")
public class SetorController {

	@Autowired
	private SetorRepository setorRepository;

	@PostMapping
	public @ResponseBody Setor novoSetor(Setor setor) {

		setorRepository.save(setor);
		return setor;

	}

}
