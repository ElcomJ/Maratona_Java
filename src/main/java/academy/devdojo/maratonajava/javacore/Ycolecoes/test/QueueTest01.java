package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Aula_182 - <b>Queue</b><br />
 * Usa o conceito de <b>FIFO</b> First In First Out<br />
 * Essa classe foi feita para poder trabalhar com prioridades customizadas<br />
 * Usando <b>String</b> quando usando o <b>poll</b> ele ordena a fila<br />
 *
 */
public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("B");
        fila.add("A");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

    }
}
