package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Aula_231 - <b>Concorrência - Conditions</b><br />
 * A interface <b>CONDITION</b> é a responsável por realizar as notificações e outras ações da LOCK<br />
 * Sempre de preferência ao que deixa o código mais LIMPO<br />
 *
 */
public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            condition.signalAll(); // notifyAll()
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try {
            while (this.emails.size() == 0) {
                if (!open) {
                    return null;
                } else {
                    System.out.println(Thread.currentThread().getName() + " Não tem emails disponível na lista, entrando em modo de espera");
                    condition.await(); // wait()
                }
            }
            return this.emails.poll(); // Retorna o proximo item da FILA
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegando emails");
            condition.signalAll(); // Corrige o erro de continuar executando com o programa encerrado
        } finally {
            lock.unlock();
        }
    }
}
