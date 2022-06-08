package youtube.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import youtube.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import youtube.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import youtube.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Zoro ", 2000);
        Gerente gerente = new Gerente("Nami ", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Goku", 3000);
        //System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
