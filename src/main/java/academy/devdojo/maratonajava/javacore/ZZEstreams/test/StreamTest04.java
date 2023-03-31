package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Aula_206 - <b>FlatMap</b><br />
 * <b>FlatMap</b> serve para poder tirar um atributo de um resultado aninhado de uma Collection<br />
 * <b>Map</b> trabalha no primeiro nivel, <b>flatMap</b> vai mais a fundo achatando os valores<br />
 * O objetivo final de uma stream e uma Stream de Strings<br />
 *
 */
public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) { // Corre cada lista
            for (String person : people) {    // Corre cada valor em cada lista
                System.out.println(person);
            }
        }

        System.out.println("-----------------------");

        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
