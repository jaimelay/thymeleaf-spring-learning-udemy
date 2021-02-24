package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.services;

import java.util.List;

import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain.Cargo;
import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.utils.PaginationUtil;

public interface CargoService {
    
    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();

    boolean cargoTemFuncionarios(Long id);

    PaginationUtil<Cargo> buscarPorPagina(int pagina, String direcao);
}
