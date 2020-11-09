package com.estacionamento.beca.service;

import java.time.Duration;
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

	@Autowired
	private CupomFiscalService cupomService;

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
		calculaTempoNaVaga(veiculoSaindo);

		return veiculoSaindo;

	}

	public PortaoAcesso calculaTempoNaVaga(PortaoAcesso veiculoSaindo) {

		PortaoAcesso registroVeiculo = portaoAcessoRepository.findById(veiculoSaindo.getId()).get();
		registroVeiculo.getHoraEntrada();
		registroVeiculo.getHoraSaida();

		LocalTime entrada = registroVeiculo.getHoraEntrada();
		LocalTime saida = registroVeiculo.getHoraSaida();

		Duration tempoNaVaga = Duration.between(entrada, saida);
		cupomService.tempoTotalEstacionado(tempoNaVaga);
		return registroVeiculo;

	}

}
