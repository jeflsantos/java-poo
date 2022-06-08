package youtube.devdojo.maratonajava.javacore.Hheranca.teste;

import youtube.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        /* SEQUENCIA DE INICIALIZAÇÃO:
         * 0 - bloco de incialização estatico de super classe é executado quando a JVM CARREGAR CLASSE PAI;
         * 1 - BLOCO DE INICIALIZAÇÃO ESTATICO DA SUB CLASSE É EXECUTADO QNAOD A jvm CARREGAR A CLASSE FILHA;
         * 2 - ALOCADO ESPAÇO EM MEMORIA PRO OBJETO DA PAI;
         * 3 - CADA ATRIBUTO DE CLASSE PAI É CRIADO E INICIALIZADO COM VALORES DEFAULT OU O QUE FOR PASSADO DA CLASSE PAI;
         * 4 - BLOCO DE INCIALIZAÇÃO DA SUPER CLASSE É EXECUTADO NA ORDEM QUE APARECE;
         * 5 - CONSTRUTOR DA SUPER CLASSE É EXECUTADO;
         * 6 - ALOCADO ESPAÇO EM MEMORIA PRO OBJETO DA SUBCLASSE;
         * 7 - CADA ATRIBUTO DA SUBCLASSE É CRIADO E INICIALIZADO COM VALORES DEFAULT OU O QUE FOR PASSADO;
         * 8 - BLOCO DE INICIALIZAÇÃO DA SUBCLASSE É EXECUTADO NA ORDEM EM QUE APARECE;
         * 9 - CONSTRUTOR DA SUBCLASSE É EXECUTADO;
         */
    }
}
