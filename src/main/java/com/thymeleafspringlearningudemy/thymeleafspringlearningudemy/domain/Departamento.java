package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DEPARTAMENTOS")
@SuppressWarnings("serial")
@Getter @Setter
public class Departamento extends AbstractEntity<Long> {
    
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;
}
