package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

/**
 * Aula_239 - <b>Concorrência - Future</b><br />
 * Com o <b>Future</b> conseguimos criar outras Threads para poder realizar outras tarefas sem dar um lock<br />
 * Usar o Future é melhor porque ele reaproveita a potencia do nucleo do processador para realizar as tarefas<br />
 * Em programação Assincrona, temos uma Thread principal (main) e outras Threads execuntando outras tarefas<br />
 * Assincrono e diferente de ParalleStreams, pois Assincrono uma somente 1 nucleo, ParallelStreams usando 1 nucleo para cada tarefa<br />
 * 
 */
public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> { // Fala para a Thread criada assima realizar uma tarefa sem utilizar a main
            TimeUnit.SECONDS.sleep(5);
            return 4.35D;
        });
        System.out.println(doSomething());
        Double dollarResponse = null;
        try {
            dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: " + dollarResponse);
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
