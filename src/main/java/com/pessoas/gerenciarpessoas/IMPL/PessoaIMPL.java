package com.pessoas.gerenciarpessoas.IMPL;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoas.gerenciarpessoas.excecoes.MsgGenericaPersonalizadaException;
import com.pessoas.gerenciarpessoas.models.Pessoa;
import com.pessoas.gerenciarpessoas.repository.PessoaRepository;
import com.pessoas.gerenciarpessoas.services.PessoaService;

@Service
@Transactional
public class PessoaIMPL implements PessoaService {

    @Autowired
    private PessoaRepository usuarioRepository;

    @Override
    public Pessoa salvar(Pessoa pessoa) {

        Pessoa user = new Pessoa();
        user.setNome(pessoa.getNome());
        user.setDataNascimento(pessoa.getDataNascimento());
        user.setEnderecoPessoa(pessoa.getEnderecoPessoa());

        return usuarioRepository.save(user);
    }

    @Override
    public List<Pessoa> listarUsuario() {

        List<Pessoa> usuario = usuarioRepository.findAll();

        if (usuario.isEmpty()) {
            throw new MsgGenericaPersonalizadaException("Sem usuários na base de dados!");
        }

        return usuario;
    }

    @Override
    public Pessoa atualizarPessoa(Pessoa usuario) {
        Optional<Pessoa> p = usuarioRepository.findById(usuario.getId());
        if (p.isEmpty()) {
            throw new MsgGenericaPersonalizadaException("Sem usuários na base de dados!");
        }
        if (!p.isEmpty()) {
        p.get().setNome(usuario.getNome());
        p.get().setDataNascimento(usuario.getDataNascimento());
        p.get().setEnderecoPessoa(usuario.getEnderecoPessoa());
        usuarioRepository.saveAndFlush(p.get());
        }
        return p.get();
    }

}
