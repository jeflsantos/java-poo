package aluraplataforma.LjavaCollections.DconjuntosSet;

import aluraplataforma.LjavaCollections.BlistasDeObjetos.Aula;


public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");

        javaColecoes.adiciona(new aluraplataforma.LjavaCollections.BlistasDeObjetos.Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new aluraplataforma.LjavaCollections.BlistasDeObjetos.Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 1111);
        Aluno a2 = new Aluno("Guilherme Silveira", 2222);
        Aluno a3 = new Aluno("Mauricio Anieche", 3333);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

    }
}
