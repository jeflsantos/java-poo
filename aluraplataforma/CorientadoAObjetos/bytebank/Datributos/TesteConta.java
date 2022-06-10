package aluraplataforma.CorientadoAObjetos.bytebank.Datributos;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setTitular("Fabio");
        conta.setSaldo(100.0);

        double valorSaque = 50.0;

        if(conta.getSaldo() >= valorSaque){
            double novoSaldo = conta.getSaldo() - valorSaque;
            conta.setSaldo(novoSaldo);
        }
    }
}
