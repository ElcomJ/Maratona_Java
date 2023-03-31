package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Aula_208 - <b>Finding and Matching</b><br />
 * Só é possivel usar <b>Lambda</b> em métodos que recebem <b>Interfaces Funcionais</b><br />
 *
 */
public class StreamTest06 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlod", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Komo desuga", 1.99),
            new LightNovel("Komo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));  // 1 ou +
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));  // Todos
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0)); // Nenhum

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny() // Qualquer Elemento
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed()) // Sem o reversed pega o menor para o maior, com pega do maior para o menor
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
