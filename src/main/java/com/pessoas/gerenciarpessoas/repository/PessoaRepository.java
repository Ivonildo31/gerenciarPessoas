package com.pessoas.gerenciarpessoas.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pessoas.gerenciarpessoas.models.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,UUID> {

    @Query(value = "SELECT * FROM tb_usuario WHERE senha = :senha AND email = :email", nativeQuery = true)
    Pessoa findUsuario(String senha, String email);
    
}
