package com.otto.aluguelVeiculo.mapper;

import com.otto.aluguelVeiculo.dto.VeiculoDTO;
import com.otto.aluguelVeiculo.models.Veiculo;

public class VeiculoMapper {

    public static VeiculoDTO toDto(Veiculo veiculo){
        VeiculoDTO dto = new VeiculoDTO();

        dto.setId(dto.getId());
        dto.setModeloCarro(dto.getModeloCarro());
        return dto;

    }

    //incompleto
}
