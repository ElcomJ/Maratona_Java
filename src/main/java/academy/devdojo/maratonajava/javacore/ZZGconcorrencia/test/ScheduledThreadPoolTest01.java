package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Aula_237 - <b>Concorrência - ScheduledExecutorService</b><br />
 * <b>newScheduledThreadPool</b> schedula uma ação para ocorrer depois de um determinado tempo<br />
 * <b>shutdown</b> Lembra de usar para poder parar o programa para ele não fica executando para sempre<br />
 * <b>scheduleWithFixedDelay</b> executa algo, e depois de um certo tempo executa denovo<br />
 * <b>scheduleAtFixedRate</b> executa depois de um tempo uma ação, porém não soma ao sleep como o WithFixedDelay<br />
 *
 */
public class ScheduledThreadPoolTest01 {

    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

//        executor.schedule(r, 5, TimeUnit.SECONDS);
//        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);
        executor.schedule(() -> {
            System.out.println("Cancelado o scheduleWithFixedDelay");
            scheduleWithFixedDelay.cancel(false);
            executor.shutdown();
        }, 10, TimeUnit.SECONDS); // Chama o Runnable através do lambda | finaliza o programa
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formatter));
        beeper();
    }
}
