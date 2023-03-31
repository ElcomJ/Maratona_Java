package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

/**
 * Aula_238 - <b>Concorrência - Interface Callable</b><br />
 * Quando estiver em ambientes <b>Multi Threads</b> usar o ThreadLocalRandom<br />
 * <b>Processamento Sincrono</b> Uma thread executando tudo do começo ao fim<br />
 * <b>Processamento Assincrono</b> Uma thread para gerenciar cada tarefa<br />
 * <b>Future</b> é uma <b>Interface</b> de processamento <b>Assincrono</b>, onde ele cria uma thread para dar uma resultado futuro sem interromper a Thread <b>MAIN</b><br />
 *
 */

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int number = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < number; i++) {
            System.out.printf("%s executando uma tarefa callable...%n", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d%n", Thread.currentThread().getName(), number);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable); // O resultando vem no futuro
        String s = future.get();
        System.out.printf("Program finished %s", s);
        executorService.shutdown();
    }
}
