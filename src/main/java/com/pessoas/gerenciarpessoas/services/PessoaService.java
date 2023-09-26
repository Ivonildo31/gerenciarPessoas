package com.pessoas.gerenciarpessoas.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.pessoas.gerenciarpessoas.models.Pessoa;


@Service
public interface PessoaService {

    public Pessoa salvar(Pessoa usuario);

    public List<Pessoa> listarUsuario();

    public Pessoa atualizarPessoa(Pessoa usuario);

    
}
