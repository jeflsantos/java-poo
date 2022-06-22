package aluraplataforma.LjavaCollections.Emaps;

public class Aula implements Comparable<Aula>{
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }

    @Override
    public String toString() {
        return "[Aula: " +this.titulo + ", " + this.tempo + " minutos.]";
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }


}
