package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Aula_133<br />
 * <b>Regex</b> são usadas para procurar padrões dentro de textos<br />
 * <b>\d</b> = Todos os digitos<br />
 * <b>\D</b> = Tudo o que não for digito<br />
 * <b>\s</b> = Espaços em branco | <b>\t \n \f \r</b><br />
 * <b>\S</b> = Todos os caracters excluindo os espaços em branco<br \>
 * <b>\w</b> = Tudo que for de <b>a-Z | A-Z | Digitos | _</b><br />
 * <b>\W</b> = Tudo que não for incluso no <b>\w</b><br />
 * <b>[]</b> = Range de caracters<br />
 *
 */
public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]"; // Buscando um valor HexDecimal
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
