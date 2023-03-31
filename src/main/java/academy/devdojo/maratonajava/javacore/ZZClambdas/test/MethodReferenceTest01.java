package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

/**
 * Aula_198 - <b>Method Reference</b><br />
 * Quando realizamos apenas uma chamada de método, podemos usar o <b>Method Reference</b><br />
 * Quando se chama mais de 1 método, não se pode usar <b>Method Reference</b><br />
 */

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One piece", 1020),
                new Anime("Naruto", 500)
        ));
        //animeList.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
