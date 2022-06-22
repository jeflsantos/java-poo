package aluraplataforma.LjavaModernoJava8.CmethodReferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//APLICANDO O JAVA 8:

public class OrdenaStringNovo {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora Casa do codigo");
        palavras.add("Caelum");

//        palavras.sort((s1, s2) -> {
//            if (s1.length() < s2.length())
//                return -1;
//            if (s1.length() > s2.length())
//                return 1;
//            return 0;
//        });

        //palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort(Comparator.comparing(s -> s.length()));

        palavras.sort(Comparator.comparing(String::length));




        System.out.println(palavras);

        //Classe Anonimas: Usamos quando a implementa interfaces curtas e quando nao vamos reaproveitar o código.

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);

        palavras.forEach(System.out::println);


    }
}

class ComparadorPorTamanho1 implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}