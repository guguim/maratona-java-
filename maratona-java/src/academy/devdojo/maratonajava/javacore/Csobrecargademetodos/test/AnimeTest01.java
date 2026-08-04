package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12 ,"Ação");
        anime.imprime();

    }
}
