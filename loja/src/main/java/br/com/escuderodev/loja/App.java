package br.com.escuderodev.loja;

import br.com.escuderodev.loja.models.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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

        Produto produto = new Produto(nome, descricao, new BigDecimal(String.valueOf(preco)));

        System.out.println(String.format("""
                Produto: %s
                Descrição: %s
                Preço R$: %.2f
                """, produto.getNome(), produto.getDescricao(), produto.getPreco()));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
