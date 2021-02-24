package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.utils;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class PaginationUtil<T> {
    private int tamanho;
    private int pagina;
    private long totalDePaginas;
    private String direcao;
    private List<T> registros;
}
