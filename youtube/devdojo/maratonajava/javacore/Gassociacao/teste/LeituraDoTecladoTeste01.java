package youtube.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();


        System.out.println("------ Seus dados estão corretos? ------");
        System.out.println("Nome: " +nome +".");
        System.out.println("Idade: " +idade +" anos.");



    }
}
