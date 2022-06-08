package youtube.devdojo.maratonajava.javabibliotecas.Fjavaio.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.txt"));

        //PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("ajhgdfjsdhjfhsdjfhjsh");
        ps.println();
        ps.println();
        ps.println();
        ps.println("oaooaoaaoaoa iaiaiai uayayhaya");

//        bw.write("Lorem ipsum ...");
//        bw.write(System.lineSeparator());
//        bw.write(System.lineSeparator());

//        bw.write("uashduahduahdkajsduih ...");

        ps.close();
    }
}
