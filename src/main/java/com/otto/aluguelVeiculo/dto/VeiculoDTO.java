package com.otto.aluguelVeiculo.dto;

public class VeiculoDTO {

    private Long id;
    private String modelo_carro;

    public VeiculoDTO(){}

    public VeiculoDTO(Long id, String modelo_carro) {
        this.id = id;
        this.modelo_carro = modelo_carro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo_carro() {
        return modelo_carro;
    }

    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }
}
