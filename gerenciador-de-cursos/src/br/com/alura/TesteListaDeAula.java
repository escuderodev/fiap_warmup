package br.com.alura;

import br.com.alura.domain.Aula;
import br.com.alura.domain.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Java Básico", 120);
        Aula a2 = new Aula("Spring Boot", 60);
        Aula a3 = new Aula("MySql", 90);

        List<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println("\n=== imprimindo a lista ===");
        System.out.println(aulas);
        aulas.forEach(System.out::println);

        System.out.println("\n=== ordenação de objetos com comparator ===");
        System.out.println(aulas);
        System.out.println("=== por nome ===");
//        Collections.sort(aulas);
        aulas.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println(aulas);

        System.out.println("=== por tempo ===");
//        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        System.out.println("\n=== criando um curso ===");
        Curso formacaoJava = new Curso("Formação Java","Escudero",aulas);
        System.out.println(String.format("""
                Curso: %s
                Instrutor: %s
                Lista de Aulas: %s
                """,formacaoJava.getNome(), formacaoJava.getInstrutor(), formacaoJava.getAulas()));

        System.out.println("=== adicionando nova aula no curso ===");
        Aula a4 = new Aula("Design Patterns",240);
        aulas.add(a4);
        System.out.println(String.format("""
                Curso: %s
                Instrutor: %s
                Lista de Aulas: %s
                """,formacaoJava.getNome(), formacaoJava.getInstrutor(), formacaoJava.getAulas()));



    }
}
