package com.otto.aluguelVeiculo.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "veiculo_tb")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modeloCarro", nullable = false)
    private String modeloCarro;

    @Column(name = "placa", nullable = false,
    unique = true)
    private String placa;

    public  Veiculo(){

    }

    public Veiculo(Long id, String modeloCarro, String placa) {
        this.id = id;
        this.modeloCarro = modeloCarro;
        this.placa = placa;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(id, veiculo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
