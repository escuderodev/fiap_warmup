package br.com.alura;

import br.com.alura.domain.Aula;
import br.com.alura.domain.Curso;

public class TestaCurso {

    public static void main(String[] args) {
        Curso formacaoJavaJunior = new Curso("Formação Java Junior", "Eduardo Escudero");

        Aula java = new Aula("Java Básico", 360);
        Aula spring = new Aula("Spring Boot", 240);
        Aula mysql = new Aula("MySql", 120);
        Aula designPatterns = new Aula("Design Patterns", 140);

        formacaoJavaJunior.add(java);
        formacaoJavaJunior.add(spring);
        formacaoJavaJunior.add(mysql);
        formacaoJavaJunior.add(designPatterns);

        System.out.println("\n=== imprimindo dados do curso ===");
        System.out.println(String.format("""
                Curso: %s
                Instrutor: %s
                Aulas: %s
                """, formacaoJavaJunior.getNome(), formacaoJavaJunior.getInstrutor(), formacaoJavaJunior.getAulas()));

        System.out.println("=== imprimindo somente as aulas ===");
        System.out.println(formacaoJavaJunior.getAulas());
        formacaoJavaJunior.getAulas().forEach(System.out::println);
    }

}
