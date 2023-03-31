package academy.devdojo.maratonajava.introducao;

/**
 * Operadores pt 02 - Relacionais
 */
public class Aula_016 {
    public static void main(String[] args) {
        // + - / *
        // %
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "    +isDezIgualVinte);
        System.out.println("isDezIgualDez "      +isDezIgualDez);
        System.out.println("isDezDiferenteDez "  +isDezDiferenteDez);
    }
}
