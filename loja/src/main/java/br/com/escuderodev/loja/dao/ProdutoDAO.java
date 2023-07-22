package br.com.escuderodev.loja.dao;

import br.com.escuderodev.loja.models.produto.Produto;

import javax.persistence.EntityManager;

public class ProdutoDAO {

    private EntityManager entityManager;

    public ProdutoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrarProduto(Produto produto) {
        entityManager.persist(produto);
    }
}
