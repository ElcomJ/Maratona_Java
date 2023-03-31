package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Aula_124 - <b>Period</b><br />
 * <b>Periodo</b> trabalha com período de datas<br />
 *
 */
public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58); // Converte para dias
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths()); // O valor que retorna não é normalizado
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS)); // Retorna o valor em meses da variavel p3 que está em semanas
    }
}
