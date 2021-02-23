package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CARGOS")
@SuppressWarnings("serial")
@Getter @Setter
public class Cargo extends AbstractEntity<Long> {
    
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
}
