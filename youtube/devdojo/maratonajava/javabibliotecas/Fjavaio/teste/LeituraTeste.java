package youtube.devdojo.maratonajava.javabibliotecas.Fjavaio.teste;


import java.io.*;

public class LeituraTeste {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo

        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
