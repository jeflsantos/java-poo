package aluraplataforma.Ijavautil.Fclassesanonimas;

public class ContaCorrente extends Conta {
    private int agencia;
    private int numero;
    private Cliente titular;

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

    @Override
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
