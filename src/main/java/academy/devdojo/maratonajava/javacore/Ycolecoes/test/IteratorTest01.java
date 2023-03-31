package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Aula_174 - <b>Iterator</b><br />
 * Nunca remover dados usando um for each<br />
 * Iterator serve para checar antes de realizar uma ação<br />
 * Podemos fazer a remoção utilizando o <b>Iterator</b> ou o <b>removeIf</b><br />
 *
 */
public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Berserk", 19.9,0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L, "Attack on titan", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));

        Iterator<Manga> iterator = mangas.iterator();

//        while (iterator.hasNext()) { // Verifica se tem algo
//            if (iterator.next().getQuantidade() == 0) { // Pega algo e verifica
//                iterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
