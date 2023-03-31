package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Aula_176 | Aula_177 - <b>NavigableSet</b><br />
 * Classes como o <b>TreeSet</b> precisam ter um compareTo na classe que for usar ela senão vai dar erro<br />
 * O sorte do TreeSet sempre vai organizar baseado no <b>compareTo</b> da classe<br />
 * Utiliza o TreeSet quando a classe implementa Comparable ou ter um Comparator criado<br />
 * Toda vez que inserir um elemento o TreeSet vai ordenar baseado ou no compareTo ou no Comparator<br />
 * O TreeSet <b>NÃO</b> aceita valor duplicado.<br />
 * TreeSet <b>NÃO</b> utiliza o <b>equals</b> para comparar duas Strings, e sim o <b>compareTo</b><br />
 * <b>lower</b> < trás o primeiro menor <br />
 * <b>floor</b> <= trás o primeiro menor junto com o valor do comparador <br />
 * <b>higher</b> > trás o primeiro maior <br />
 * <b>ceiling</b> >= trás o primeiro maior com o valor do comparador <br />
 * <b>pollFirst</b> pega o primeiro da lista e remove<br />
 * <b>pollLast</b> pega o ultimo da lista e remove<br />
 *
 */

class SmarthphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Berserk", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L, "Attack on titan", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 8, 5);
        System.out.println("--------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());

    }
}
