package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Aula_131 - <b>Regex</b><br />
 * Realiza a busca de qualquer coisa através de <b>Meta Characters</b><br />
 * Também é utilizado para realizar <b>Validações</b><br />
 * Class <b>Pattern</b> é o padrão<br />
 * Class <b>Matcher</b> encontra o padrão<br />
 *
 */
public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        //String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
