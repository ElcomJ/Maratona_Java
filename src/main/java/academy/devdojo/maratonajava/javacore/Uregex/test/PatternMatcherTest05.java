package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Aula_135<br /><br />
 * <b>Regex</b> são usadas para procurar padrões dentro de textos<br /><br />
 * <b>\d</b> = Todos os digitos<br />
 * <b>\D</b> = Tudo o que não for digito<br />
 * <b>\s</b> = Espaços em branco | <b>\t \n \f \r</b><br />
 * <b>\S</b> = Todos os caracters excluindo os espaços em branco<br \>
 * <b>\w</b> = Tudo que for de <b>a-Z | A-Z | Digitos | _</b><br />
 * <b>\W</b> = Tudo que não for incluso no <b>\w</b><br />
 * <b>[]</b> = Range de caracters<br /><br />
 * <b>Quantificadores</b> são caracters que vai nos ajudar a retorna uma expressão inteira<br /><br />
 * <b>?</b> = Zero ou uma<br />
 * <b>*</b> = Zero ou mais<br />
 * <b>+</b> = Uma ou mais<br />
 * <b>{n, m}</b> = De n até m<br />
 * <b>( )</b> = Agrupamento de um valor que aparece mais de uma vez<br />
 * <b>|</b> = Ou Ex: o(v|c)o = <b>ovo ou oco</b><br />
 * <b>$</b> = Representa o <b>FIM</b> da linha<br />
 * <b>.</b> Ex: <b>1.3</b> = <b>123, 133, 1@3, 1A3</b><br />
 */
public class PatternMatcherTest05 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // Validando emails
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
