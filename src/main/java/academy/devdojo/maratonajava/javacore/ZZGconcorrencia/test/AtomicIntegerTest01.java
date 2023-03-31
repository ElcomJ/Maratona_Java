package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Aula_229 | Aula_230 - <b>Concorrência - AtomicInteger | Lock and ReentrantLock</b><br />
 * Ao usar o <b>Synchronized</b> perdemos perfomance, pois só uma Thread vai executar<br />
 * <b>atomicInteger</b> usa a técnica de <b>Compare and Swap</b> internamente<br />
 * <b>AtomicInteger</b> faz com que a operação seja feita de forma <b>ATÔMICA</b><br />
 * Não precisa se preocupar com o <b>LOCK</b> por causa do <b>COMPARE AND SWAP</b><br />
 * Ao usando o lock pelo <b>synchronized</b> a JVM controla quem terá o acesso<br />
 * A <b>INTERFACE LOCK</b> é melhor utilizada para fazer Locks<br />
 * Ao usar o <b>ReentrantLock</b> temos um maior controle do Lock nas Threads<br />
 * Se pegar o lock utilizando a interface LOCK temos que lembrar de liberar o lock assim que a tarefa for realizada<br />
 * Utilizar a interface LOCK somente se for necessário ou se precisar de alguma função que só ela realize<br />
 * Dar preferência ao <b>synchronized</b> para deixar o código o mais simples possível de se entender<br />
 */

class Counter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);

    void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.incrementAndGet();
        } finally {
            lock.unlock();
        }

    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
