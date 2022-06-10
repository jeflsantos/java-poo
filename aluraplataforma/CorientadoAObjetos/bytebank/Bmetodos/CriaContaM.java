package aluraplataforma.CorientadoAObjetos.bytebank.Bmetodos;

public class CriaContaM {

    public static void main(String[] args) {
        ContaMetodo primeiraConta = new ContaMetodo();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        ContaMetodo segundaConta = primeiraConta;
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
    }
}
