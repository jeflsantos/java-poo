package aluraplataforma.CorientadoAObjetos.bytebank.Econstrutores;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta(123,456);
        System.out.println(Conta.getTotal());
    }
}
