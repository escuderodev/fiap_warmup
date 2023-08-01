package br.com.alura.domain;

import java.util.Objects;

public class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo!");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " Matrícula: " + matricula;
    }

    @Override
    public boolean equals(Object outroAluno) {
        Aluno outro = (Aluno) outroAluno;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
