package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

/**
 * Aula_112<br />
 * Date <b>java.util</b> != Date <b>java.sql</b><br />
 * Date <b>java.util</b> é mais comum em sistemas legados<br />
 * <b>.toString</b> converte o valor recebido em uma data que possamos ler.<br />
 * Date funciona com um <b>Long de Milisegundos</b> ele converte para uma data<br />
 *
 */
public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1677457291836L); // long 100000 mls
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
