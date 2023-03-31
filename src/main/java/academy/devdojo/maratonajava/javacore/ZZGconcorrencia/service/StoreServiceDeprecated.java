package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

/**
 * Aula_242 - <b>CompletableFuture - ThreadFactory</b><br />
 * <b>ThreadLocalRandom.current()</b> gera um numero aleatório<br />
 * <b>CompletableFuture</b> não precisa mais de um Executor para executar<br />
 *
 */
public class StoreServiceDeprecated {

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    private double priceGenerator() {
        System.out.printf("'%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
