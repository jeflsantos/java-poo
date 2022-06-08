package youtube.devdojo.maratonajava.javacore.Gassociacao.teste;

import youtube.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
