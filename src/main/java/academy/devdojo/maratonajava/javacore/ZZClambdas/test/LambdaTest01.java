package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

/**
 * Aula_196 - <b>Lambdas</b><br />
 * <b>Predicate</b> executa uma operação e retorna um boolean<br />
 * <b>Consumer</b> executa uma operação e não retorna nada<br />
 */
public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("William", "Suane", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(strings, s -> System.out.println(s));  // Lambda
        forEach(integers, i -> System.out.println(i)); // Lambda
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) { // Método Genérico
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
