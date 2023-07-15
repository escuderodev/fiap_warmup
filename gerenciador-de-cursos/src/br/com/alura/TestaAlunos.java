package br.com.alura;

import br.com.alura.domain.Aluno;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Eduardo");
        alunos.add("Pedro");
        alunos.add("Paulo");
        alunos.add("Carol");
        alunos.add("Aline");

        System.out.println("\n=== imprimindo um set ===");
        System.out.println(alunos);

        System.out.println("\n=== imprimindo um set com foreach ===");
        alunos.forEach(System.out::println);

        System.out.println("\n=== verificar se uma aluno existe na lista ===");
        boolean aluno = alunos.contains("Eduardo");
        System.out.println(aluno);

        System.out.println("\n=== gerando uma arraylist a partir de um set ===");
        List<String> alunosEmLista = new ArrayList<>(alunos);
        alunosEmLista.forEach(System.out::println);

        System.out.println("\n=== ordenando um arraylist ===");
        Collections.sort(alunosEmLista);
        alunosEmLista.forEach(System.out::println);

    }
}
