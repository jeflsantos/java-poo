package youtube.devdojo.maratonajava.javacore.Bintroducaometodos.testes;

import youtube.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Joao";
        funcionario.idade = 20;
        funcionario.salarios = new double[] {1200, 987.30, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalarial();






    }
}
