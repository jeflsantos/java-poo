package aluraplataforma.Ijavautil.Cequals;

public class ContaCorrente extends Conta {
    private int agencia;
    private int numero;

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);

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
