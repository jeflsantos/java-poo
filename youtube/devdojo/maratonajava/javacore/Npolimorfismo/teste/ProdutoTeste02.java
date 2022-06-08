package youtube.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import youtube.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import youtube.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryze 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
