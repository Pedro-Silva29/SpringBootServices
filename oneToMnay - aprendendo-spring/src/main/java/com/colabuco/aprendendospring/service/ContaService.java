package com.colabuco.aprendendospring.service;

import com.colabuco.aprendendospring.model.Cliente;
import com.colabuco.aprendendospring.model.Conta;
import com.colabuco.aprendendospring.repository.ClienteRepository;
import com.colabuco.aprendendospring.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class ContaService {

    @Service
    private final ContaRepository;

    @Autowired
    public ContaRepository(ContaRepository contaRepository){
        this.contaRepository = contaRepository;
    }

    public Cliente criarConta(Conta conta){
        return contaRepository.save(conta);
    }

    public List<Cliente> ListarContas(){
        return contaRepository.findAll();
    }

    public Optional<Cliente> returnarContapeloId(Long id){
        return contaRepository.findById(id);
    }

    public Cliente retornarContaPeloNome(String nome){
        return contaRepository.findByNome(nome);
    }
}
