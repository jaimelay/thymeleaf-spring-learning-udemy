package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.services;

import java.util.List;

import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain.Departamento;

public interface DepartamentoService {
    
    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();
}
