package com.otto.aluguelVeiculo.repository;

import com.otto.aluguelVeiculo.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
