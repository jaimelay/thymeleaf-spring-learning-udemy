package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.dao;

import java.util.List;

import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain.Cargo;
import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.utils.PaginationUtil;

import org.springframework.stereotype.Repository;

@Repository
public class CargoDAOImpl extends AbstractDAO<Cargo, Long> implements CargoDAO {
    public PaginationUtil<Cargo> buscaPaginada(int pagina, String direcao) {
        int tamanho = 5;
        int inicio = (pagina - 1) * tamanho;
    
        List<Cargo> cargos = getEntityManager()
            .createQuery("SELECT c FROM Cargo c ORDER BY c.nome " + direcao, Cargo.class)
            .setFirstResult(inicio)
            .setMaxResults(tamanho)
            .getResultList();
        
        long totalRegistros = count();
        long totalDePaginas = (totalRegistros + (tamanho - 1)) / tamanho;

        return new PaginationUtil<>(tamanho, pagina, totalDePaginas, direcao, cargos);
    }

    public long count() {
        return getEntityManager()
                .createQuery("SELECT COUNT(*) FROM Cargo", Long.class)
                .getSingleResult();
    }
}
