package com.estacionamento.beca.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.beca.model.CupomFiscal;
import com.estacionamento.beca.repository.CupomFiscalRepository;

@Service
public class CupomFiscalService {
	
	
	@Autowired
	private CupomFiscalRepository cupomRepository;

	public CupomFiscal salvaCupom(CupomFiscal cupomFiscal) {

		cupomRepository.save(cupomFiscal);
		return cupomFiscal;

	}

	public CupomFiscal tempoTotalEstacionado(Duration tempoNaVaga) {
		
		CupomFiscal cupom =new CupomFiscal();
	
		
		cupom.setTempoTotal(tempoNaVaga.toMinutes());
		cupomRepository.save(cupom);
		
		return cupom;
	}
	
	
	
	
	
	
	

}
