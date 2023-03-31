package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * Aula_120 - <b>LocalTime</b><br />
 * <b>LocalTime</b> trabalha com <b>TIME</b><br />
 * A hora vai de 00:00 até 23:00, se passar disso retorn Exceptionb<br />
 */
public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY)); // Usando outra classe
        System.out.println(LocalTime.MIN); // Pega a hora do inicio do dia
        System.out.println(LocalTime.MAX); // Pega a hora final do dia
    }
}
