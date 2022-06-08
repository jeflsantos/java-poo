package youtube.devdojo.maratonajava.javabibliotecas.Fjavaio.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"));
        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useDelimiter(",");
            linhaScanner.useLocale(Locale.US);
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numConta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"),"%s - %04d-%08d, %s: %08.2f %n", tipoConta, agencia, numConta, titular, saldo);

            linhaScanner.close();
//            String[] valores = linha.split(",");
//            System.out.println(valores[3]);
        }
        scanner.close();

    }
}
