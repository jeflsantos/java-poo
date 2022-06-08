package youtube.devdojo.maratonajava.javabibliotecas.Fjavaio.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.txt"));

        bw.write("Lorem ipsum ...");
        bw.write(System.lineSeparator());
        bw.write(System.lineSeparator());

        bw.write("uashduahduahdkajsduih ...");

        bw.close();
    }
}
