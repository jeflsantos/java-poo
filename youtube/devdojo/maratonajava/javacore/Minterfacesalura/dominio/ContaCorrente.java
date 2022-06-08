package youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio;

import youtube.devdojo.maratonajava.javacore.Minterfacesalura.servicos.Tributavel;
import youtube.devdojo.maratonajava.javacore.Npolimorfismoalura.dominio.Conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

//    @Override
//    public void saca(double valor) {
//        double valorASacar = valor + 0.2;
//        //return super.saca(valorASacar);
//    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
