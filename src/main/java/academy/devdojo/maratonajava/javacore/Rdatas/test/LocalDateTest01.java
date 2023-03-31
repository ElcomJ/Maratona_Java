package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

/**
 * Aula_119<br />
 * <b>LocalDate</b> ajuda a nossa vida <b>PREFERENCIA EM USAR ESSA</b><br />
 * <b>LocalDate</b> atribuido no Java 8, trabalha com <b>DATE</b><br />
 * <b>Date and Calendar</b> atribuidos no Java 1<Br />
 */
public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        LocalDate now = LocalDate.now(); // Criando uma instância da classe
        now = now.plusWeeks(4); // Como a classe é imutavel, precisamos criar uma nova instância e atribuir o valor a ela
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // Retorna se o ano é bisexto
        System.out.println(date.get(ChronoField.YEAR)); // Usa outra Classe para passar o valor
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(now);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
