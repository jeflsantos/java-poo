package aluraplataforma.KjavaCollections.DconjuntosSet;

import aluraplataforma.KjavaCollections.BlistasDeObjetos.Aula;

import java.util.Iterator;
import java.util.Set;


public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");

        javaColecoes.adiciona(new aluraplataforma.KjavaCollections.BlistasDeObjetos.Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new aluraplataforma.KjavaCollections.BlistasDeObjetos.Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 2222);
        Aluno a3 = new Aluno("Mauricio Anieche", 3333);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O aluno " +a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse turini, esta matriculado?");
        System.out.println(a1.equals(turini));

        System.out.println("O a1 é equals ao turini?");
        System.out.println(a1.equals(turini));

        //obrigatoriamente o seguinte é true:

        System.out.println(a1.hashCode() == turini.hashCode());

        System.out.println("====================");


        System.out.println("Todos alunos matriculados:");
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()){
            Aluno proximoAl = iterador.next();
            System.out.println(proximoAl);
        }


    }
}
