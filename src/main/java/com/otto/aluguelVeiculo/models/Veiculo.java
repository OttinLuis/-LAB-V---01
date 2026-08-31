package com.otto.aluguelVeiculo.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "veiculo_tb")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modelo_carro", nullable = false)
    private String modelo_carro;

    @Column(name = "placa", nullable = false,
    unique = true)
    private String placa;

    public  Veiculo(){

    }

    @OneToOne
    @JoinColumn(name = "aluguelVeiculo")
    private AluguelVeiculo aluguelVeiculo;

    public Veiculo(Long id, String modelo_carro, String placa) {
        this.id = id;
        this.modelo_carro = modelo_carro;
        this.placa = placa;
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
