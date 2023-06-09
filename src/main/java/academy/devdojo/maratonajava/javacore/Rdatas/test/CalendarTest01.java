package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

/**
 * Aula_113<br />
 * Calendar e da <b>java.util</b> e é uma classe <b>abstrata</b><br />
 * Classes abstratas <b>NÃO</b> se cria instância<br />
 */
public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) { // Compara o primeiro dia da semana com o 1 do calendar
            System.out.println("Domingão é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.roll(Calendar.HOUR, 5);
        Date date = c.getTime();
        System.out.println(date);
    }
}
