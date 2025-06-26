package devdojo.maratonajava.javacore.Csobrecargametodos.test;

import devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12, "Ação");

        // anime.init("Akudama Drive", "TV", 12);

//        anime.setNome("Akudama Drive");
//        anime.setTipo("Tv");
//        anime.setEpisodios(12);

        anime.Imprime();
    }
}
