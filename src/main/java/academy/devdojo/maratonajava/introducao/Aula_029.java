package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas de Repetição pt 03 - Break
 */
public class Aula_029 {
    public static void main(String[] args) {

        // break só quebra um switch ou um loop para fora

        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break; // Aqui o break vai sair do for
            }
            System.out.println(i);
        }

    }
}
