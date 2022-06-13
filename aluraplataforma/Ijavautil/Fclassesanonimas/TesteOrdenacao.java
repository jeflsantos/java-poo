package aluraplataforma.Ijavautil.Fclassesanonimas;

import java.util.ArrayList;
import java.util.List;

public class TesteOrdenacao {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        Conta cc12 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc12.setTitular(clienteCC1);
        cc12.deposita(333.0);

        Conta cc13 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc13.setTitular(clienteCC2);
        cc13.deposita(444.0);

        Conta cc14 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc14.setTitular(clienteCC3);
        cc14.deposita(111.0);

        Conta cc15 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc15.setTitular(clienteCC4);
        cc15.deposita(222.0);
    }

}
