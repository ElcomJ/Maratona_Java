package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Aula_230 - <b>Concorrência - Lock and ReentrantLock</b><br />
 * <b>isHeldByCurrentThread</b> verifica se o lock está nas mãos da Thread que está executando o código<br />
 * <b>getQueueLenght</b> retorna o numero de Threads esperando paga pegar o lock<br />
 */

class worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() { // Thread.start() executa esse código
        lock.lock();
        try {
            System.out.printf("Thread %s entrou em uma sessão critica%n", name);
            System.out.printf("%d Threads esperando na fila%n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera%n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new worker("A", lock)).start();
        new Thread(new worker("B", lock)).start();
        new Thread(new worker("C", lock)).start();
        new Thread(new worker("D", lock)).start();
        new Thread(new worker("E", lock)).start();
        new Thread(new worker("F", lock)).start();
        new Thread(new worker("G", lock)).start();
    }
}
