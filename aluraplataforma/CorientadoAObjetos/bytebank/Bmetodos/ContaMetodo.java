package aluraplataforma.CorientadoAObjetos.bytebank.Bmetodos;

public class ContaMetodo {

    double saldo;
    int agencia;
    int numero;
    String titular;

    //dentro da class Conta

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, ContaMetodo destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
