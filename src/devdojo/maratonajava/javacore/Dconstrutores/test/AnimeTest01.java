package devdojo.maratonajava.javacore.Dconstrutores.test;


import devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação");

        anime.Imprime();
    }
}


// Podemos chamar construtores somente utilizando this() - porem so funciona para construtores