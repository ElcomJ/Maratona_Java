package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Aula_180 - <b>Map</b><br />
 * <b>HashMap</b> se não for preciso se preocupar com a ordem que vai ficar<br />
 * <b>LinkedHashMap</b> se precisar manter a ordem que for inserido<br />
 */
public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Berserk", 19.9);
        Manga manga2 = new Manga(1L, "Hellsing Ultimate", 9.5);
        Manga manga3 = new Manga(4L, "Attack on titan", 3.2);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball Z", 2.99);

        List<Manga> mangaConsumidor1 = List.of(manga1, manga2, manga3); // Adiciona varios mangas em uma Lista
        List<Manga> mangaConsumidor2 = List.of(manga4, manga5); // Adiciona varios mangas em uma Lista
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1);
        consumidorManga.put(consumidor2, mangaConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(" - " + manga.getNome());
            }

        }
    }
}
