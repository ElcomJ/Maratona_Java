package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Aula_118<br />
 * java.text onde fica as principais classes de <b>Formatação</b><br />
 * Usar <b>'content'</b> quando quiser que o SimpleDateFormat ignore algo na formatação<br />
 *
 */
public class SimplesDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdan' dd 'at' MMMM 'de' yyyy"; // Cria um pattern de formatação
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdan 27 at February de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
