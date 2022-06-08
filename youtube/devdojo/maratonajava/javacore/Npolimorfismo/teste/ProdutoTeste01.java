package youtube.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import youtube.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import youtube.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import youtube.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import youtube.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliane", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularimposto(computador);
        System.out.println("----------");
        CalculadoraImposto.calcularimposto(tomate);
        System.out.println("----------");
        CalculadoraImposto.calcularimposto(tv);
    }
}
