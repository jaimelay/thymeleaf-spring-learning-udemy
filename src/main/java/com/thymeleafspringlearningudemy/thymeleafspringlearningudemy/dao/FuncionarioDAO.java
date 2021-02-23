package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.dao;

import java.util.List;

import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain.Funcionario;

public interface FuncionarioDAO {
    
    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
