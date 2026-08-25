package com.otto.aluguelVeiculo.exception;

public class RecursoNaoEncontradoException extends NegocioException {
    public RecursoNaoEncontradoException(String recurso, Long id) {
        super(recurso + " não encontrado com id: " + id);
    }
}