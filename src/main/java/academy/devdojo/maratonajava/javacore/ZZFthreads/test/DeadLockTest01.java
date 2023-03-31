package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

/**
 * Aula_227 - <b>Sincronismo de Thread - DeadLock</b><br />
 * Quando por um azar ocorre o <b>DeadLock</b> somente reiniciando a aplicação para resolver<br />
 * <b>DeadLock</b> ocorre quando uma Thread que ja está em um <b>Lock</b> tenta acessar um <b>Lock</b> que outra Thread está segurando<br />
 *
 */
public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando lock 1");
                System.out.println("Thread 1: Esperando lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Segurando lock 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Segurando lock 2");
                System.out.println("Thread 2: Esperando lock 1");
                synchronized (lock1) {
                    System.out.println("Thread 2: Segurando lock 1");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
