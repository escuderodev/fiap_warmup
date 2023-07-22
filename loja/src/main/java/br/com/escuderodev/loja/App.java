package br.com.escuderodev.loja;

import br.com.escuderodev.loja.dao.CategoriaDAO;
import br.com.escuderodev.loja.dao.ProdutoDAO;
import br.com.escuderodev.loja.models.categoria.Categoria;
import br.com.escuderodev.loja.models.produto.Produto;
import br.com.escuderodev.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scan.nextLine();

        System.out.print("Digite a descrição do produto: ");
        String descricao = scan.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        BigDecimal preco = scan.nextBigDecimal();

        System.out.print("Digite a categoria ");
        String categoriaDigitada = scan.next();

        Categoria categoria = new Categoria(categoriaDigitada);
        Produto produto = new Produto(nome, descricao, new BigDecimal(String.valueOf(preco)), categoria);

        EntityManager entityManager = JPAUtil.getEntityManager();
        CategoriaDAO categoriaDAO = new CategoriaDAO(entityManager);
        ProdutoDAO produtoDAO = new ProdutoDAO(entityManager);

        entityManager.getTransaction().begin();
        categoriaDAO.cadastrarCategoria(categoria);
        produtoDAO.cadastrarProduto(produto);
        entityManager.getTransaction().commit();

        System.out.println("\n");
        System.out.println(String.format("""
                Produto: %s
                Descrição: %s
                Preço R$: %.2f
                Categoria: %s
                """, produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getCategoria().getNomeCategoria()));
    }
}
