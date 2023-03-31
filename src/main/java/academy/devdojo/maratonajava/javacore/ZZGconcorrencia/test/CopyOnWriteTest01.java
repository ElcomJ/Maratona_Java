package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Aula_233 - <b>Concorrência - CopyOnWriteArrayList</b><br />
 * final = imutavel<br />
 * <b>Imutabilidade</b> é quando um Objeto é criado, não poder alterar mais <b>NADA</b> daquele Objeto<br />
 * <b>CopyOnWrite</b> é uma Collection <b>Imutavel</b><br />
 * O <b>List</b> em si é uma Collection <b>IMUTAVEL</b>, porque toda hora que for alterar algo, ela cria uma Lista nova<br />
 * <b>List</b> não é ThreadSafe<br />
 * O iterator mantém uma Copia da List no momento de sua criação<br />
 * Ao usar o ArrayList ele não consegue printar o valor<br />
 *
 */

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        Runnable runnableIterator = () -> { // O () serve para receber atributos ou classe
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnableRemover = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);
                list.remove(i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
    }
}
