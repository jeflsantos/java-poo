package aluraplataforma.Ijavautil.BarrayList;

public class ContaCorrente extends Conta{
    private int agencia;
    private int numero;

    public ContaCorrente(int agencia, int numero, int agencia1, int numero1) {
        super(agencia, numero);
        this.agencia = agencia1;
        this.numero = numero1;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
