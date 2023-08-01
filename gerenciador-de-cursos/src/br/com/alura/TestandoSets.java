package br.com.alura;

import br.com.alura.domain.Aluno;
import br.com.alura.domain.Aula;
import br.com.alura.domain.Curso;

public class TestandoSets {

    public static void main(String[] args) {

        Curso formacaoDev = new Curso("Formação Dev", "Eduardo Escudero");

        Aula java = new Aula("Java",240);
        Aula mysql = new Aula("MySql",240);
        Aula html = new Aula("Html",240);
        Aula css = new Aula("CSS",240);
        Aula javascript = new Aula("JavaScript",240);

        Aluno carol = new Aluno("Carol", "11111");
        Aluno alicia = new Aluno("Alícia", "22222");
        Aluno juan = new Aluno("Juan", "33333");
        Aluno valmir = new Aluno("Valmir", "44444");

        formacaoDev.adicionarCurso(java);
        formacaoDev.adicionarCurso(mysql);
        formacaoDev.adicionarCurso(html);
        formacaoDev.adicionarCurso(css);
        formacaoDev.adicionarCurso(javascript);

        formacaoDev.matricularAluno(carol);
        formacaoDev.matricularAluno(alicia);
        formacaoDev.matricularAluno(juan);
        formacaoDev.matricularAluno(valmir);

        formacaoDev.detalhaCurso();

        Aluno aluno = alicia;
        System.out.println("\n=== pesquisando se o(a) aluno(a) " + aluno + " está matriculado(a) ===");
        System.out.println("Aluno matriculado? " + formacaoDev.verificaMatricula(aluno));

        Aluno lilli = new Aluno("Alícia","99999");
        System.out.println("O aluno " + lilli.getNome() + " é igual ao aluno " + alicia.getNome());
        System.out.println(alicia.equals(lilli));
    }
}
