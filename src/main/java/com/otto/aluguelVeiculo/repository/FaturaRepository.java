package com.otto.aluguelVeiculo.repository;

import com.otto.aluguelVeiculo.models.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}
