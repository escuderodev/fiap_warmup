package br.com.alura;

import br.com.alura.domain.Aula;
import br.com.alura.domain.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso formacaoJavaJunior = new Curso("Formação Java Junior", "Eduardo Escudero");

        formacaoJavaJunior.add(new Aula("Java Básico", 360));
        formacaoJavaJunior.add(new Aula("Spring Boot", 240));
        formacaoJavaJunior.add(new Aula("MySql", 120));
        formacaoJavaJunior.add(new Aula("Design Patterns", 140));

        System.out.println("=== trabalhando com a lista imutável ===");
        List<Aula> aulasImutaveis = formacaoJavaJunior.getAulas();
        System.out.println(aulasImutaveis);

        System.out.println("\n=== transformando a lista imutável em mutável para ordená-la ===");
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println("Tempo Total: " + formacaoJavaJunior.getTempoTotal() + " minutos");
        System.out.println("Tempo Total: " + formacaoJavaJunior.getTempoTotalJava8() + " minutos");

        System.out.println(formacaoJavaJunior.toString());
    }

}
