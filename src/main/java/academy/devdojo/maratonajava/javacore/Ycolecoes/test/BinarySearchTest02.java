package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aula_172 - <b>Binary Search</b><br />
 * <b>(-(ponto de inserção) -1)</b><br />
 * Para o Binary Search funcionar a lista PRECISA estar <b>Ordenada</b><br />
 * index 0, 1, 2, 3<br />
 * value 0, 2, 3, 4<br />
 * Se for fazer uma ordenação customizada com o <b>Comparator</b>, precisa passar ele também no binarySearch<br />
 *
 */
public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.add(new Manga(5L, "Berserk", 19.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(4L, "Attack on titan", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99));

        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Dragon ball Z", 2.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));

    }
}
