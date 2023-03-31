package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas Condicionais pt 03 - Operador ternário
 */
public class Aula_022 {
    public static void main(String[] args) {

        // (condicao) ? verdadeiro : falso;
        // Usar somente com variáveis do mesmo tipo
        // int com int | string com string ...

        double salario = 3000;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);

    }
}
