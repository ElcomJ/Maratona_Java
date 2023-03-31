package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.domain.Account;

/**
 * Aula_224 | Aula_225 - <b>Sincronismo de Thread</b><br />
 * Para uma classe rodar em Threads diferentes pode tanto implementar o <b>Runnable</b> como criar uma lambda com ele<br >
 * Quando tem varias Threads acessando ao mesmo tempo o mesmo Objeto, pode ocorrer um problema de paralelismo<br />
 * Para resolver isso, precisamos definir o método  aonda executa aquilo como <b>ATÔMICO</b>, utilizando o <b>SYNCHRONIZED</b> que é um <b>LOCK</b><br />
 * Quando utilizamos o <b>SYNCHRONIZED</b> para dar lock no método, ele faz o Lock direto no <b>OBJETO DA CLASSE</b><br />
 * Isso faz com que a Thread que começar a executar o processo, vai pode terminar ele sem que outra thread acesse junto<br />
 * <b>Synchronized</b> no método, da lock na classe onde o método esta, <b>Synchronized</b> separada da lock no objeto e no bloco de código atomico<br />
 *
 */
public class ThreadAccountTest01 implements Runnable {

    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

    private static synchronized void print() {

    }

    private void withdrawal(int amount) { // O syncronized não deixa existir paralelismo
        System.out.println(getThreadName() + " ####fora do syncronized");
        synchronized (account) { // Quando usamos o lock assim, ele fecha o objeto account e abre quando a threadh que estiver usando terminar
            System.out.println(getThreadName() + " ****dentro do syncronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }

    }

    private static String getThreadName () {
        return Thread.currentThread().getName();
    }
}
