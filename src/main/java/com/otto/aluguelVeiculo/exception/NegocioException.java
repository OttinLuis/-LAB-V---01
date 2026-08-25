package com.otto.aluguelVeiculo.exception;

public abstract class NegocioException extends RuntimeException {
    public NegocioException(String mensagem) {
        super(mensagem);
    }
}