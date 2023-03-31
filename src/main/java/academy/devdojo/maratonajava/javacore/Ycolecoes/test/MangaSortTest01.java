package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Aula_170 | Aula_171- <b>Sorting Lists</b><br />
 * O método sort implementa a interface <b>Comparable</b><br />
 * Para modificar o método sort, necessitamos dar overwrite no metodo <b>CompareTo</b> da Interface <b>Comparable</b> e adicionar a regra de sort lá dentro<br />
 */
class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(4L, "Attack on titan", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator()); // Precisa de um comparator
        System.out.println("------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
