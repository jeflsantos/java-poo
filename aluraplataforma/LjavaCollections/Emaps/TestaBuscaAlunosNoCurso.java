package aluraplataforma.LjavaCollections.Emaps;

import aluraplataforma.LjavaCollections.BlistasDeObjetos.Aula;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");

        javaColecoes.adiciona(new aluraplataforma.LjavaCollections.BlistasDeObjetos.Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new aluraplataforma.LjavaCollections.BlistasDeObjetos.Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Anieche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 5617?");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " +aluno);

    }
}
