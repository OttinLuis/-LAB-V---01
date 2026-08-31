package com.otto.aluguelVeiculo.models;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "fatura_tb")
public class Fatura  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pagamento_basico", nullable = false)
    private Double pagamentoBasico;
    @Column(name = "imposto", nullable = false)
    private Double imposto;

    public Fatura(){}

    public Fatura(Long id, Double pagamentoBasico, Double imposto) {
        this.id = id;
        this.pagamentoBasico = pagamentoBasico;
        this.imposto = imposto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    @ManyToOne
    @JoinColumn(name = "aluguel_veiculo")
    private AluguelVeiculo aluguelVeiculo;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Fatura fatura = (Fatura) o;
        return Objects.equals(id, fatura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
