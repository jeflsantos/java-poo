package aluraplataforma.CorientadoAObjetos.bytebank.Econstrutores;

public class Conta {
    private String titular;
    private double saldo;
    private int agencia;
    private int numero;

    public static int total = 0;

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
        total++;
        System.out.println("Estou criando uma conta");
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void saca(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        }
    }

    public void deposita(double valor){
        if(valor>0){
            saldo += valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
