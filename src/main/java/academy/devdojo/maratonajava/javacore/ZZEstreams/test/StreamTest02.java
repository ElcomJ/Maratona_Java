package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Aula_204 - <b>Streams</b><br />
 * As streams possuem dois tipos de operações, <b>INTERMEDIARIAS</b> e <b>FINAIS</b><br />
 * <b>INTERMEDIARIAS</b> é uma ação que retorna o proprio stream (encadeamento)<br />
 * <b>FINAIS</b> é uma ação que finaliza a streams, e salva o valor filtrado em uma Collection<br />
 * Streams trabalha com dados em tempo<br />
 *
 */
public class StreamTest02 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlod", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Komo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)// Extrai o que passar aqui
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
