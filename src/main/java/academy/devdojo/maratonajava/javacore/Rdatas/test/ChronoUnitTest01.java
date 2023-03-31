package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * Aula_125 - <b>ChronoUnit</b><br />
 * <b>ChronoUnit</b> é um classe<b>(ENUM)</b> de padronização de datas.<br />
 * Ela é boa para pegar <b>DATAS</b><br />
 * Ela consegue pegar uma valor em data como <b>Month | Weeks | Days | Years</b> entre duas datas<br />
 * <b>Duration</b> Para <b>Hora</b><br />
 * <b>Period</b> Para <b>Data</b><br />
 * <b>Instant</b> Para <b>Nanosegundos</b> para o computador<br />
 * <b>LocalDate</b> Para <b>Datas</b> para seres humanos<br />
 * <b>LocalDateTime</b> Para <b>Data e Hora</b><br />
 * <b>LocalTime</b> Para <b>Hora</b><br />
 * <b>ChronoUnit</b> Para <b>Retorna conversão em outras datas</b><br />
 *
 */
public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
