package academy.devdojo.maratonajava.introducao;

/**
 * Tipos primitivos pt 04 - Strings
 */
public class Aula_013 {
    public static void main(String[] args) {

        int age = (int) 1000000000000000L;
        long numeroGrande = 516116111;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D; // A letra no final especifica o tipo
        byte idadeByte = 10;
        short idadeShort = 33;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String name = "Goku";

        System.out.println("A idade é " + age + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);

        System.out.println("Oi meu nome é " + name);

    }
}
