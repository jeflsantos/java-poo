package youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio;


import youtube.devdojo.maratonajava.javacore.Npolimorfismoalura.dominio.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
