package youtube.devdojo.maratonajava.javacore.Hheranca.teste;

import youtube.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import youtube.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import youtube.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11211-444");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setCpf("111.222.333-44");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Arthur");
        funcionario.setCpf("222.222.222-97");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3000);
        funcionario.imprime();
        System.out.println("----------");
        funcionario.relatorioPagamento();
    }
}
