package br.com.escuderodev.loja.dao;

import br.com.escuderodev.loja.models.categoria.Categoria;
import javax.persistence.EntityManager;

public class CategoriaDAO {

    private EntityManager entityManager;

    public CategoriaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrarCategoria(Categoria categoria) {
        entityManager.persist(categoria);
    }
}
