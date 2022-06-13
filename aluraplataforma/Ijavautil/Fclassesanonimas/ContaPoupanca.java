package aluraplataforma.Ijavautil.Fclassesanonimas;

public class ContaPoupanca extends Conta {
    private int agencia;
    private int numero;

    public ContaPoupanca(int agencia, int numero) {
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

