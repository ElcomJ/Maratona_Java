package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.domain.Anime;

/**
 * Aula_060
 */
public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("One Piece"); // Criando variavel de referencia para anime e criando uma nova instancia em memória.
        System.out.println(anime.getNome());

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }

    }
}
