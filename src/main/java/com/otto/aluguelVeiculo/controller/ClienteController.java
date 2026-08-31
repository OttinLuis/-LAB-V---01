package com.otto.aluguelVeiculo.controller;

import com.otto.aluguelVeiculo.dto.ClienteCreateDTO;
import com.otto.aluguelVeiculo.dto.ClienteDTO;
import com.otto.aluguelVeiculo.exception.RecursoNaoEncontradoException;
import com.otto.aluguelVeiculo.mapper.ClienteMapper;
import com.otto.aluguelVeiculo.models.Cliente;
import com.otto.aluguelVeiculo.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    @GetMapping
    public List<ClienteDTO> findAll() {
        return clienteRepository.findAll()
                .stream()
                .map(ClienteMapper::toDto)
                .toList();
    }

    @PostMapping
    public ClienteDTO save(@Valid  @RequestBody ClienteCreateDTO dto) {

        Cliente cliente = ClienteMapper.toEntity(dto);

        Cliente clienteSalvo = clienteRepository.save(cliente);

        return ClienteMapper.toDto(clienteSalvo);
    }

    @PutMapping("/{id}")
    public ClienteDTO atualizar(
            @PathVariable Long id,
            @RequestBody ClienteCreateDTO dto) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Cliente", id));

        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setSenha(dto.getSenha());

        Cliente clienteAtualizado = clienteRepository.save(cliente);

        return ClienteMapper.toDto(clienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        if (!clienteRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Cliente", id);
        }

        clienteRepository.deleteById(id);
    }
}
