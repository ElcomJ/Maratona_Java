package academy.devdojo.maratonajava.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Aula_228 - <b>Sincronismo de thread - Wait, notify e notifyAll</b><br />
 * Só pode chamar o <b>wait</b> se estiver dentro de um <b>synchronized block</b><br />
 * <b>notify</b> avisa somente uma Thread | <b>notifyAll</b> avisa todas as Threads<br />
 *
 */
public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (this.emails) {
            while (this.emails.size() == 0) {
                if (!open) {
                    return null;
                } else {
                    System.out.println(Thread.currentThread().getName() + " Não tem emails disponível na lista, entrando em modo de espera");
                    this.emails.wait();
                }
            }
            return this.emails.poll(); // Retorna o proximo item da FILA
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegando emails");
            this.emails.notifyAll(); // Corrige o erro de continuar executando com o programa encerrado
        }
    }
}
