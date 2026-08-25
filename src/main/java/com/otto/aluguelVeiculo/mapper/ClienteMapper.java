package com.otto.aluguelVeiculo.mapper;

import com.otto.aluguelVeiculo.dto.ClienteCreateDTO;
import com.otto.aluguelVeiculo.dto.ClienteDTO;
import com.otto.aluguelVeiculo.models.Cliente;

public class ClienteMapper {

    public static ClienteDTO toDto(Cliente cliente) {

        ClienteDTO dto = new ClienteDTO();

        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setEmail(cliente.getEmail());

        return dto;
    }

    public static Cliente toEntity(ClienteCreateDTO dto){
        Cliente cliente = new Cliente();

        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setSenha(dto.getSenha());

        return cliente;

        //dar uma analisada

    }
}