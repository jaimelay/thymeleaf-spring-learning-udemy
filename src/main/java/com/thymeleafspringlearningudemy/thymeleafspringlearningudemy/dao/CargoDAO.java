package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.dao;

import java.util.List;

import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain.Cargo;

public interface CargoDAO {
    
    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
