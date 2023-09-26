package com.pessoas.gerenciarpessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.gerenciarpessoas.models.Pessoa;
import com.pessoas.gerenciarpessoas.services.PessoaService;



@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @CrossOrigin
	@PostMapping
	public Pessoa salvar(@RequestBody Pessoa usuario) {
		return pessoaService.salvar(usuario);
	}

	@CrossOrigin
	@GetMapping("/todos")
	public List<Pessoa> buscarUsuarios() {
	  return pessoaService.listarUsuario();
	}

	@CrossOrigin
	@PutMapping
	public Pessoa atualizar(@RequestBody Pessoa usuario) {
		return pessoaService.atualizarPessoa(usuario);
	}

    
}
