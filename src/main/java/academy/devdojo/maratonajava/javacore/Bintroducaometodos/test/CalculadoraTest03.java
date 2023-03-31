package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2); // Inicializa uma variavel para receber o valor do return
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20, 0));
        System.out.println("---------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
