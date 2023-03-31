package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Aula_197 <b>Lambda Function</b><br />
 * <b>Function</b> recebe dois argumento <b>T</b> o que vai entrar, <b>R</b> o que vai sair<br /><br />
 * Se o nosso lambda chama somente 1 método, podemos usar <b>method reference</b><br />
 *
 * Principais Interfaces Funcionais:<br />
 * - <b>Predicate</b><br />
 * - <b>Consumer</b><br />
 * - <b>Function</b> Recebe o tipo de entrada e o tipo de saida<br />
 *
 */
public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> integers = map(strings, String::length);
        List<String> map = map(strings, String::toUpperCase);
        System.out.println(integers);
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) { // T = Entry | R = Out
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
