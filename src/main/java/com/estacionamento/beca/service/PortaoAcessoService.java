package com.estacionamento.beca.service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.beca.model.PortaoAcesso;
import com.estacionamento.beca.repository.PortaoAcessoRepository;

@Service
public class PortaoAcessoService {

	@Autowired
	private PortaoAcessoRepository portaoAcessoRepository;

	@Autowired
	private SetorService setorService;

	public PortaoAcesso entrouNaVaga(PortaoAcesso portaoAcesso) {
		portaoAcesso.setHoraEntrada(LocalTime.now());
		portaoAcesso.setDataEntrada(LocalDate.now());
		portaoAcesso.setSetor(setorService.buscarTodos());
		portaoAcessoRepository.save(portaoAcesso);

		return portaoAcesso;

	}
	
	
	

	public PortaoAcesso saiuDaVaga(PortaoAcesso portaoAcesso) {

		PortaoAcesso veiculoSaindo = portaoAcessoRepository.findById(portaoAcesso.getId()).get();

		veiculoSaindo.setHoraSaida(LocalTime.now());
		veiculoSaindo.setDataSaida(LocalDate.now());
		portaoAcessoRepository.save(veiculoSaindo);

		return veiculoSaindo;

	}

}
