package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Aula_218 | Aula_219 - <b>Parallel Streams</b><br />
 * <b>Parallel Streams</b> é quando voce divide uma stream para trabalhar em multiplas threads<br />
 * Antes de se usar <b>Parallel Streams</b> faça <b>BENCHMARK</b> para saber se realmente ele é melhor<br />
 * Ter cuidado com o Boxing e Unboxing (Trabalhar com tipo primitivo e wrapper ao mesmo tempo)<br />
 * <b>(limit and findFirst</b> não é recomendado para se usar em Parallel, <b>findAny</b> é recomendado<br />
 * Ter cuidado por causa do <b>Custo total da computação</b> usar se o processamento for alto<br />
 * Se a quantidade de dados for pequena, não vale a pena usar <b>Parallel Streams</b><br />
 * Ter cuidado com o tipo de <b>Collection</b> que for usar junto com o <b>Parallel Streams</b><br />
 * Dar preferencia por Stream com tamanho <b>DEFINIDO</b><br />
 * Ter cuidado com o <b>Processamento MERGE</b> Ex:<br /><br />
 *
 * if (tarefa for pequena e não pode ser dividida)<br />
 * faz sequencialmente<br />
 * else {<br />
 * divide em duas tarefas<br />
 * chama o metodo recursivamente<br />
 * espera todas as tarefas serem completadas<br />
 * Combina o resultado<br />
 * }<br />
 *
 *
 */
public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result = result + i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum sumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    // [1,2,3,4,5,6,7,8,9,0]
    // 1 - 1-5
    // 2 - 6-0
    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum ParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}