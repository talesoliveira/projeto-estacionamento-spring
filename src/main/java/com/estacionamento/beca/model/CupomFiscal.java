package com.estacionamento.beca.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CupomFiscal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private BigDecimal taxaHoraAtual;

	private Long tempoTotal;

	public Long getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(Long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public CupomFiscal() {

	}

	public BigDecimal getPrecoTotal() {
		return taxaHoraAtual;
	}

	public void setPrecoTotal(BigDecimal precoTotal) {
		this.taxaHoraAtual = precoTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getTaxaHoraAtual() {
		return taxaHoraAtual;
	}

	public void setTaxaHoraAtual(BigDecimal taxaHoraAtual) {
		this.taxaHoraAtual = taxaHoraAtual;
	}

}
