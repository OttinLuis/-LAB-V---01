package com.otto.aluguelVeiculo.controller;

import com.otto.aluguelVeiculo.dto.VeiculoDTO;
import com.otto.aluguelVeiculo.mapper.VeiculoMapper;
import com.otto.aluguelVeiculo.models.Veiculo;
import com.otto.aluguelVeiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<VeiculoDTO> findAll(){
        return veiculoRepository.findAll()
                .stream()
                .map(VeiculoMapper:: toDto)
                .toList();

    }

    //incompleto
    //está aparecendo "null" mesmo preenchido no banco
}
