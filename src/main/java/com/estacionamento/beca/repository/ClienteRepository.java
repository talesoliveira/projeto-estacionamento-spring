package com.estacionamento.beca.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.estacionamento.beca.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
