package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas de Repetição pt 04 - Exercício Break
 */
public class Aula_030 {
    public static void main(String[] args) {

        double valorTotal = 30000;

        for (int i = 1; i <= valorTotal; i++) {
            double valorParcela = valorTotal / i;

            if (valorParcela < 1000) {
                break; // Quebra para fora do for enquanto o if for TRUE
            }
            System.out.println("Parcela " + i + " R$ " + valorParcela);
        }
    }
}
