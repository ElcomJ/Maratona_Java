package academy.devdojo.maratonajava.introducao;

/**
 * Tipos primitivos pt 03 - casting
 */
public class Aula_012 {
    public static void main(String[] args) {

        // Fazer o casting não é uma boa prática
        // É melhor trocar o tipo da variavel

        int age = (int) 1000000000000000L;
        long numeroGrande = 516116111;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D; // A letra no final especifica o tipo
        byte idadeByte = 10;
        short idadeShort = 33;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';

        System.out.println("A idade é " + age + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);

    }
}
