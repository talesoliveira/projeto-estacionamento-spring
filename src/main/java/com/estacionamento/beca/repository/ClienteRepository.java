package com.estacionamento.beca.repository;

import org.springframework.data.repository.CrudRepository;

import com.estacionamento.beca.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
