package youtube.devdojo.maratonajava.javacore.Bintroducaometodos.testes;

import youtube.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import youtube.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoryia";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Midoryia";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

            impressora.imprime(estudante01);

            impressora.imprime(estudante02);

    }
}
