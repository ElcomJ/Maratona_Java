package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Aula_123 - <b>Duration</b><br />
 * <b>Durantion</b> mostra a diferença de tempo entre duas datas diferentes<br />
 * <b>P</b> período (datas)<br />
 * <b>T</b> tempo<br />
 * A <b>Duration</b> não aceita o <b>LocalDate</b> porque ela não tem <b>SEGUNDO</b><br />
 * <b>Duration</b> trabalha com período de tempo.
 */
public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4); // Retorna em Horas
        System.out.println(d5);
        System.out.println(d6);
    }
}
