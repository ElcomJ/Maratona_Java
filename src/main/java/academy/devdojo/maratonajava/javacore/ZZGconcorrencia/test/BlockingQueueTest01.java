package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Aula_234 - <b>Concorrência - ArrayBlockingQueue</b><br />
 * É uma Interface boa para Threads<br />
 * <b>peek()</b> retorna um valor sem remover da lista<br />
 * Quando é atingido o tamanho máximo da Fila, a <b>Thread</b> fica esperando liberar espaço para poder adicionar um novo valor<br />
 * Se estiver cheio o <b>put</b> vai bloquear, se tiver 0 e dar o <b>take</b> ele bloqueia esperando um valor na queue<br />
 */
public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("William");
        System.out.printf("%s added the value%s%n ", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Suane");
        System.out.printf("%s added the value%s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueue implements Runnable { // O runnable é para poder criar um run de Thread
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 5s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
