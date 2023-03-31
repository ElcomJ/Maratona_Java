package academy.devdojo.maratonajava.javacore.Qstring.test;

/**
 * Aula_109<br />
 * <b>Lenght</b> da string é um <b>Método</b>, <b>Lenght</b> do array é um <b>Atributo</b><br />
 * <b>substring()</b> o primeiro parametro usa o start 0, o segundo usar o start 1<br />
 * Se passar somente um valor, o start é 0<br />
 *
 */
public class StringTest02 {
    public static void main(String[] args) {
        String nome = "       Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2)); // n - 1
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim()); // remove valores em branco no começo e no fim
    }
}
