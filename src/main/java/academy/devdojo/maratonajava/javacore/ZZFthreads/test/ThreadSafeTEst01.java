package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aula_226 - <b> Sincronismo de Thread - Thread Safe</b><br />
 * Dar preferencia por usar o <b>Synchronized</b> para poder deixar uma class totalmente <b>Thread Safe</b><br />
 * Quando for trabalhar com classes <b>Thread Safe</b> tentar evitar o paralelismo para evitar problemas de multiplos acessos<br />
 *
 */

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add (String name) {
        names.add(name);
    }

    public synchronized void removeFirst() {
        if (names.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTEst01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
