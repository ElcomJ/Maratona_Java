package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

/**
 * Aula_220 | Aula_221 | Aula_222 - <b>Threads</b><br />
 * <b>Daemon</b> and <b>User</b><br />
 * <b>Garbage Collector</b> limpa e remove os objetos de memória<br />
 * <b>Threads do tipo USER</b> assim que ela finalizar o programa vai acabar<br />
 * <b>Threads do tipo DAEMON</b> não tem tanto foco<br />
 * <b>run</b> executa tudo na mesma thread<br />
 * <b>start</b> inicia uma nova thread<br />
 * A sequencia que as <b>Threads</b> iram executar, a JVM que cuida. Não temos como controlar isso<br />
 * Usar <b>Interface</b> é o jeito recomendado de trabalhar com Thread<br />
 * E possivel controlar a execução das Threads a partir do <b>Scheduler</b><br />
 * Não pode usar o <b>start</b> duas vezes<br /><br />
 * <p>
 * Os <b>ESTÁGIOS</b> de uma Thread:<br /><br />
 *
 * <b>New</b> - Quando se cria um Objeto<br />
 * <b>Runnable</b> - Quando da start na Thread<br />
 * <b>Running</b> - A threadh está em execução<br />
 * <b>Waiting/Blocked</b> - A threadh está dormindo ou blockeada esperando outra<br />
 * <b>Dead</b> - A Thread morre, não é possivel recuperar uma Thread morta, só criando um objeto novo<br /><br />
 * <p>
 * É posivel dar <b>PRIORIDADE</b> de execução para as Threads com <b>Thread.setPriority(Thread.MAX_PRIORITY);</b><br />
 * É possivel por uma Thread para <b>DORMIR</b> com o <b>Thread.sleep();</b><br />
 *
 */

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
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
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
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
            try {
                Thread.sleep(2000); // Precisa de Try - Catch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), "T4D");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("###################################" + Thread.currentThread().getName());
    }
}
