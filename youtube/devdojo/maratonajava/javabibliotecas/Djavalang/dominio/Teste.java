package youtube.devdojo.maratonajava.javabibliotecas.Djavalang.dominio;

public class Teste {
    public static void main(String[] args) {
        //Array [] sao colchetes associados a um tipo de dado;

        int[] idades = new int[5]; // Um array tbm é um objeto.

//        idades[0] = 29;
//        idades[1] = 19;
//        idades[2] = 39;
//        idades[3] = 59;
//        idades[4] = 69;
//
//        int idade1 = idades[1];
//        System.out.println(idade1);

        for (int i = 0; i< idades.length; i++){
            idades[i] = i*i;
        }
        for (int i = 0; i< idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
