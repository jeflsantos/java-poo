package youtube.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public class Cliente {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }
    private String nome;
    private TipoCliente TipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, youtube.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        TipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + TipoCliente +
                ", TipoClienteInt=" + TipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
