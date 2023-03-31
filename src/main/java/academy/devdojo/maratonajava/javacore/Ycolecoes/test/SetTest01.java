package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

/**
 * Aula_175 - <b>Set</b><br />
 * <b>Set</b> não permite valores <b>duplicados</b><br />
 * Set não é indexado<br />
 * <b>HashSet</b> leva em consideração todos os valores do hashCode da classe<br />
 * <b>LinkedHashSet mantêm a ordem de inserção</b><br />
 * <b>HashSet</b> não mantém a ordem de inserção<br />
 *
 */
public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Berserk", 19.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(4L, "Attack on titan", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
