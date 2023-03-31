package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Aula_211 - <b>Gerando Streams</b><br />
 * Se for usar alta performance, usar os <b>Streams</b> dos tipos <b>PRIMITIVOS</b> <br />
 * <b>range/b> 1..n-1 | <b>rangeClosed</b> 1..n<br />
 * Trabalhando com Stream de tipos primitivos, evitamos o Boxing e Unboxing<br />
 *
 */
public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        IntStream.range(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        Stream.of("Eleve ", "0 ", "Cosmo ", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        int num[] = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println();

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(l -> l.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
