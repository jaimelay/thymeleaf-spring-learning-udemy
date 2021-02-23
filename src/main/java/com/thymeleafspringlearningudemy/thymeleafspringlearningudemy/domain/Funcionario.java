package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "FUNCIONARIOS")
@SuppressWarnings("serial")
@Getter @Setter
public class Funcionario extends AbstractEntity<Long> {
    
    @Column(nullable = false, unique = true)
    private String nome;

    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;

    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    private Cargo cargo;
}
