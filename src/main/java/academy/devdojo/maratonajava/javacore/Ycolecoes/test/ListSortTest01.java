package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aula_169 - <b>Sorting Lists</b><br />
 * Se precisar passar outro valor em um List de double, fazer o cast Ex: <b>23D</b><br />
 *
 */
public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on titan");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");

        Collections.sort(mangas); // Organiza uma List em ordem alfabetica ou numerica

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }


    }
}
