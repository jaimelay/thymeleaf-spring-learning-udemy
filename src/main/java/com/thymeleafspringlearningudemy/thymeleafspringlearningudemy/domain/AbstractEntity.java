package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@SuppressWarnings("serial")
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private ID id;
}
