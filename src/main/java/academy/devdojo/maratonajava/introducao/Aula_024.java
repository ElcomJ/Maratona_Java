package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas Condicionais pt 05 - Resolução do exercícios
 */
public class Aula_024 {
    public static void main(String[] args) {

        // num * 0.50 = 50% de num
        // num * 1.50 = num somado com 50% de num

        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68587) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
