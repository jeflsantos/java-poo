package aluraplataforma.KjavaCollections.DconjuntosSet;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo");
        alunos.add("Alberto");
        alunos.add("Nico");
        alunos.add("Sergio");
        alunos.add("Renan");
        alunos.add("Mauricio");

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });



    }
}
