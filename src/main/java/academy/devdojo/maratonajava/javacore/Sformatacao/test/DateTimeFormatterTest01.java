package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Aula_129 - <b>DateTimeFormatter</b><br />
 * <b>DateTimeFormatter</b> é uma classe para formatação de datas<br />
 * Format = <b>Objeto para String</b><br />
 * Parse = <b>String para Objeto</b><br />
 * Br = <b>dd/MM/yyyy</b> | <b>EUA = MM/dd/yyyy</b> | <b>JAPAN = yyyy/MM/dd</b><br />
 *
 */
public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); // Objeto para String
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20230301", DateTimeFormatter.BASIC_ISO_DATE); // String para Objeto
        LocalDate parse2 = LocalDate.parse("2023-03-01+05:00", DateTimeFormatter.ISO_DATE); // String para Objeto
        LocalDate parse3 = LocalDate.parse("2023-03-01", DateTimeFormatter.ISO_LOCAL_DATE); // String para Objeto
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2023-03-01T15:42:58.127346143");
        System.out.println(parse4);

        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBrasil);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("01/03/2023", formatterBrasil);
        System.out.println(parseBR);

        DateTimeFormatter formatterGerman = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGerman = LocalDate.now().format(formatterGerman);
        System.out.println(formatGerman);
        LocalDate parseGerman = LocalDate.parse("01.März.2023", formatterGerman);
        System.out.println(parseGerman);
    }
}
