package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

/**
 * Aula_128 - <b>ZoneDateTime, ZoneId and OffsetDateTime</b><br />
 * <b>ZoneOffSet</b> permite trablhar com as <b>Zonas</b> utilizando <b>Horarios</b><br />
 * <b>ZoneId</b> retorna um <b>Map(Dicionário)</b> com todas as <b>Zonas</b> disponiveis<br />
 * <b>ZoneDateTime</b> permite atribuir Zonas a Datas<br />
 * Como a classe <b>Instant</b> usa o Zulu Time <b>UTC</b>, ele é o unico que coloca o horario baseado no horário da Zona<br />
 *
 */
public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Shanghai");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate1 = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(japaneseDate1);
    }
}
