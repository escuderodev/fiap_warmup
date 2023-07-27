package br.com.alura.domain;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor, List<Aula> aulas) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adicionarCurso(Aula aula) {

        aulas.add(aula);
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }

        return tempoTotal;
    }

    public int getTempoTotalJava8() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void detalhaCurso() {
        System.out.println("\n=== Descrição do Curso ===");
        System.out.println(String.format("""
                Nome: %s
                Instrutor: %s
                """, this.nome, this.instrutor));

        System.out.println("=== Aulas do Curso ===");
        aulas.forEach(System.out::println);

        System.out.println("\n=== Alunos Matriculados ===");
        alunos.forEach(System.out::println);

        System.out.println("\n=== Duração do Curso ===");
        int total = 0;
        for (int i = 0; i < aulas.size(); i++) {
            total += aulas.get(i).getTempo();
        }
        System.out.println(total + " minutos");
    }
}
