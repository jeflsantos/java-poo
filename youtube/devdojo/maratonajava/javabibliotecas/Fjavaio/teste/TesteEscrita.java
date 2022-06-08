package youtube.devdojo.maratonajava.javabibliotecas.Fjavaio.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem ipsum ...");
        bw.newLine();
        bw.newLine();
        bw.write("uashduahduahdkajsduih ...");

        bw.close();
    }
}
