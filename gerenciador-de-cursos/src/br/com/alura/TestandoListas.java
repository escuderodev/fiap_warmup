package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Java";
        String aula2 = "Spring";
        String aula3 = "MVC";
        String aula4 = "MySql";

        List<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println("\n=== imprimindo a lista ===");
        System.out.println(aulas);

        System.out.println("\n=== ordenando a lista ===");
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("\n=== removendo item da lista ===");
        aulas.remove(aula4);
        System.out.println(aulas);

        aulas.add(aula4);

        System.out.println("\n=== percorrendo a lista com foreach ===");
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        System.out.println("\n=== percorrendo a lista com for padrão ===");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("A " + (i + 1) + "ª aula é: " + aulas.get(i));
        }

        System.out.println("\n=== pegando o primeiro item da lista pelo indice ===");
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula será de " + primeiraAula);

        System.out.println("\n=== percorrendo a lista com foreach + action ===");
        aulas.forEach(System.out::println);

        System.out.println("\n=== brincando e percorrendo a lista com foreach + action ===");
        aulas.forEach(aula -> {
            System.out.println("percorrendo...");
            System.out.println("Aula " + aula);
        });
    }
}
