package com.otto.aluguelVeiculo.exception;

public class RecursoDuplicadoException extends NegocioException {
    public RecursoDuplicadoException(String mensagem) {
        super(mensagem);
    }
}