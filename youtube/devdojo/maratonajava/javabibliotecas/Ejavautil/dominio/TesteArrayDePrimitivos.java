package youtube.devdojo.maratonajava.javabibliotecas.Ejavautil.dominio;

public class TesteArrayDePrimitivos {
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

        /*
        Sobre Arrays aprendemos:

            Um array é uma estrutura de dados e serve para guardar elementos (valores primitivos ou referências)
            Arrays usam colchetes ([]) sintaticamente
            Arrays têm um tamanho fixo!
            Um array também é um objeto!
            Arrays são zero-based (o primeiro elemento se encontra na posição 0)
            Um array é sempre inicializado com os valores padrões.
            Ao acessar uma posição inválida recebemos a exceção ArrayIndexOutOfBoundException
            Arrays possuem um atributo length para saber o tamanho
            A forma literal de criar uma Array, com o uso de chaves {}.
         */
    }
}
