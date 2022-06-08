package youtube.devdojo.maratonajava.javabibliotecas.Djavalang.dominio;

public class ClasseString {
    public static void main(String[] args) {

        String nome = "Alura"; // Objeto literal
        nome.replace("A", "a");

        String outra = nome.replace("A", "a");

        System.out.println(nome);
        System.out.println(outra);

        //A classe String é imutável, ou seja, ela nasce e morre da mesma forma e nao pode ser alterada.
    }

    /*
    Analisando o System.out.println:

    System:
        - é uma classe.. pacote java.lang.. acesso publico (public);

    out:
        - é um atributo.. acesso publico (public).. out é uma referencia.. acesso estatico (static);

    println:
        - é um metodo.. tem acesso publico (public).. não static..sobrecarga.. não joga exceções do tipo checked;



     */
}
