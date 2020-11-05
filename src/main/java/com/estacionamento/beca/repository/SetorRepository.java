package com.estacionamento.beca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.estacionamento.beca.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

}
