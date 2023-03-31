package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

/**
 * Aula_209 - <b>Reduce</b><br />
 * <b>Reduce</b> aplica as alterações aos elemento e te da uma saída <b>UNICA</b><br />
 * Quando for usar mais de 1 valor no lambda, use (x, y) <-- Assim<br />
 *
 */
public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0, (x, y) -> x + y)); // O 0 diz que o primeiro valor é 0

        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0, Integer::sum));

        System.out.println("---------------------------------------");

        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0, (x, y) -> x * y));

        System.out.println("---------------------------------------");

        integers.stream()
                .reduce((x, y) -> x > y ? x : y)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0, Integer::max));
    }
}
