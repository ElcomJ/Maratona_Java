package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

/**
 * Orientação Objetos - Métodos pt 05 - Parâmetros tipo primitivo | Aula_048
 */
public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);

        System.out.println("\nDentro CalculadoraTest04");

        System.out.println("Num1 " +a);
        System.out.println("Num2 " +b);
    }
}
