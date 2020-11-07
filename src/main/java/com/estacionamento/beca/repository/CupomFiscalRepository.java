package com.estacionamento.beca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estacionamento.beca.model.CupomFiscal;
@Repository
public interface CupomFiscalRepository extends JpaRepository<CupomFiscal, Long> {

}
