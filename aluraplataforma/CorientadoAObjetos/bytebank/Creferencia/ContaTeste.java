package aluraplataforma.CorientadoAObjetos.bytebank.Creferencia;

public class ContaTeste {
    public static void main(String[] args) {
        ContaReferencia contaDaMarcela = new ContaReferencia();

        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";
    }
}
