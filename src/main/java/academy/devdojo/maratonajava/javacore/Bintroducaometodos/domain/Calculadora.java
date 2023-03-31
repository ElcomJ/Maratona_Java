package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

/**
 * Orientação Objetos - Métodos pt 01 | Aula_044 | Aula_045 | Aula_046 | Aula_047 | Aula_048 | Aula_052
 */
public class Calculadora {
    // Não pode usar sout em função void pois ela não retorna nada, tem que chamar a função sem sout
    public void somaDoisNumeros() { // void retorna nada, só executa uma saida no console
        // Isso aqui é um método
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { // parametro
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) { // retorna um valor double
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2) { // retorna um valor double
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não existe divisão por zero");
            return 0;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) { // retorna um valor double
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return; // Funciona como um break em uma função void
        }
        System.out.println(num1 / num2);

    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " +numero1);
        System.out.println("Num2 " +numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int i: numeros) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int...numeros) { // var args
        int soma = 0;
        for(int i: numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
