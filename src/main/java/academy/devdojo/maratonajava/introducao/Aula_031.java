package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas de Repetição pt 05 - Continue
 */
public class Aula_031 {
    public static void main(String[] args) {

        double valorTotal = 30000;

        for (int i = (int) valorTotal; i >= 1; i--) {
            double valorParcela = valorTotal / i;
            if (valorParcela < 1000) {
                continue; // Continue ignora tudo abaixo enquanto if for TRUE;
            }
            System.out.println("Parcela " +i+ " R$ " +valorParcela);
        }

    }
}
