package youtube.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
