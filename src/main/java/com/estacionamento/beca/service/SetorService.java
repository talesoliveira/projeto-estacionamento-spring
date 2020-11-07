package com.estacionamento.beca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.beca.model.Setor;
import com.estacionamento.beca.repository.SetorRepository;

@Service
public class SetorService {

	@Autowired
	private SetorRepository setorRepository;

	public Setor salvaSetor(Setor setor) {

		setorRepository.save(setor);
		return setor;

	}
	
	public Setor buscarTodos() {
		return setorRepository.findAll().get(0);
	}

}
