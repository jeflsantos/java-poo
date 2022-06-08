package youtube.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import youtube.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import youtube.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("GOKU");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F1");
        ferrari.imprime();
    }
}
