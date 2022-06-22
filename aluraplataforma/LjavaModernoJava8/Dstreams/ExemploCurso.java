package aluraplataforma.LjavaModernoJava8.Dstreams;

import java.util.*;
import java.util.stream.Collectors;

class Curso{
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos).forEach(System.out::println);

        OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos).average();

        System.out.println(media);

        cursos.stream().filter(c -> c.getAlunos() >= 100).findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        cursos = cursos.stream().filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());

        cursos.stream().forEach(c -> System.out.println(c.getNome()));




    }
}
