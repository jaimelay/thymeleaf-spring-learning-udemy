package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CARGOS")
@SuppressWarnings("serial")
@Getter @Setter
public class Cargo extends AbstractEntity<Long> {
    @NotBlank(message = "O nome do cargo é obrigatório.")
    @Size(max = 60, message = "O nome do cargo deve conter no máximo {max} caracteres.")
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @NotNull(message = "Selecione o departamento relativo ao cargo.")
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
}
