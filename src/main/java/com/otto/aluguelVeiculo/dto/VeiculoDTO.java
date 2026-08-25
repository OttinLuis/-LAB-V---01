package com.otto.aluguelVeiculo.dto;

public class VeiculoDTO {

    private Long id;
    private String modeloCarro;

    public VeiculoDTO(){}

    public VeiculoDTO(Long id, String modeloCarro) {
        this.id = id;
        this.modeloCarro = modeloCarro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

}
