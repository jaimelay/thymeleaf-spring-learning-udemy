package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.services;

import java.util.List;

import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain.Funcionario;

public interface FuncionarioService {
    
    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}
