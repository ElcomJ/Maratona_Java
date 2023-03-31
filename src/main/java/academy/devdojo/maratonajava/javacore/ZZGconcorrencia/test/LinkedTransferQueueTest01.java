package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 * Aula_235 - <b>Concorrência - LinkedTransferQueue</b><br />
 * LinkedTransferQueue = ConcurrentLinkedQueue + SynchronousQueue, LinkedinBlockingQueue<br />
 * <b>tq.remainingCapacity()</b> retorna a capacidade da <b>LinkedTransferQueue</b><br />
 *
 */
public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("william")); // Adiciona o elemento, se não tiver espaço retorna uma Exception
        System.out.println(tq.offer("william"));
        System.out.println(tq.offer("william", 10, TimeUnit.SECONDS)); // Mesma coisa que o add, porém retorna False invés de uma Exception
        tq.put("DevDojo"); // Bloqueia esperando um espaço disponível
        if (tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo"); // Bloqueia a Thread até outro elemento tenta pegar o valor
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element()); // Exibe o Head da Fila porém não remove, se estiver vazia da uma Exception
        System.out.println(tq.peek());
        System.out.println(tq.poll()); // Pega e remove o primeiro elemento da fila
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
