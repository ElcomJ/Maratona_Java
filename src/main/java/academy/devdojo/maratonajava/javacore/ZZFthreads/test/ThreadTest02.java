package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

/**
 * Aula_223 - <b>Threads</b><br />
 * Utilizar o Runnable com lambda se o método não precisar de um argumento<br />
 * <b>yield</b> avisa para o <b>Scheduler</b> para dar uma pausa na Thread<br />
 * <b>join</b> fala para a Thread main para se <b>JUNTAR</b> a outra Thread<br />
 * Isso faz com que outra Thread <b>NÃO</b> inicie, enquanto a Thread que a main fez o join terminar<br />
 *
 */

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String  c) {
        this.c = c;
    }

    @Override
    public void run() { // codigo que vai ser executado pela Thread
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
    }
}
