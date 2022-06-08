package youtube.devdojo.maratonajava.javacore.Kenumeracao.teste;

import youtube.devdojo.maratonajava.javacore.Kenumeracao.dominio.Cliente;
import youtube.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
