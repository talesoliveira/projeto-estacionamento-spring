package com.estacionamento.beca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estacionamento.beca.model.PortaoAcesso;
@Repository
public interface PortaoAcessoRepository extends JpaRepository<PortaoAcesso,Long > {

}
