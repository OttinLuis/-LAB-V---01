package com.otto.aluguelVeiculo.mapper;

import com.otto.aluguelVeiculo.dto.VeiculoDTO;
import com.otto.aluguelVeiculo.models.Veiculo;

public class VeiculoMapper {

    public static VeiculoDTO toDto(Veiculo veiculo){
        VeiculoDTO dto = new VeiculoDTO();

        dto.setId(veiculo.getId());
        dto.setModelo_carro(veiculo.getModelo_carro());
        return dto;

    }

    public static Veiculo toEntity(VeiculoDTO veiculoDTO){
        Veiculo veiculo = new Veiculo();

        veiculo.setId(veiculo.getId());
        veiculo.setModelo_carro(veiculo.getModelo_carro());

        return veiculo;
    }
}
