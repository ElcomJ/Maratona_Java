package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Aula_191 - <b>Anonymous Classes</b><br />
 * <b>Classes Anônimas</b> são classes que iram existir por um momento e não pode ser reutilizada<br />
 * Uma classe anônima, é uma classe que criamos quando queremos alterar um método somente para um pedaço de código<br />
 * Quando se usa <b>List.of</b> a lista fica imutável<br />
 */

public class AnonymousClassesTest02 {
    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        // Anonymous Class
        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome())); // Anonymous Class Using Lambda
        barcoList.sort(new Comparator<Barco>() { // Anonymous Class
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);
    }
}
