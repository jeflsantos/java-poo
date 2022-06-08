package youtube.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import youtube.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 12);
        anime.init("Naruto", "TV", 12, "Ação");


        anime.imprime();
    }
}
