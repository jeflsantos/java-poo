package youtube.devdojo.maratonajava.introducao;

public class Aula04_Operadores {
    public static void main(String[] args) {
    // +; -; /; *;

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 * numero02;
        System.out.println(resultado);

        // % -> resto da divisão. Resto da divisao por 2 for igual a 0, o numero é par, se caso der 1 o numero é impar.
        int resto = 20 % 2;
        System.out.println(resto);

        // < menor; > maior; <= menor igual; >= maior igual; == igual; != diferente;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorqueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorqueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " +isDezDiferenteVinte);

        // Operadores Logicos: && (AND); || (OR);
        /* &&: (Sera verdadeiro se toda expressão for verdadeira);                      ||: (Será falso se toda expressão for falsa);
         * V && V = V                                                                   V || V = V
         * V && F = F                                                                   V || F = V
         * F && V = F                                                                   F || V = V
         * F && F = F                                                                   F || F = F
         */

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta  " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta  " +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " +isPlaystationCincoCompravel);

        // = recebe; += mais igual; -= menos igual; /= divisão igual; *= multiplicação igual;

        double bonus = 1800;
        bonus += 1000; // que é a mesma coisa que: bonus = bonus + 1000;
        bonus -= 1000; // que é a mesma coisa que: bonus = bonus - 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // INCREMENTAÇÃO (CONTADOR): ++; --;

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        System.out.println(contador);

    }
}
