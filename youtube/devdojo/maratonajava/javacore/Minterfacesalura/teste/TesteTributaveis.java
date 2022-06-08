package youtube.devdojo.maratonajava.javacore.Minterfacesalura.teste;

import youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio.CalculadorImposto;
import youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio.ContaCorrente;
import youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio.SeguroVida;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroVida seguro = new SeguroVida();


        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());



    }
}
