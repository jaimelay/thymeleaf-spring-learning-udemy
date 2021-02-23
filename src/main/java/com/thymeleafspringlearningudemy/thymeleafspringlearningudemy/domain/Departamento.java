package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DEPARTAMENTOS")
@SuppressWarnings("serial")
@Getter @Setter
public class Departamento extends AbstractEntity<Long> {
    @NotBlank(message = "Informe um nome.")
    @Size(min = 3, max = 60, message = "O nome do departamento deve ter entre {min} e {max} caracteres.")
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;
}
