package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas de Repetição pt 01 - Laços de repetição while, do while, for
 */
public class Aula_027 {
    public static void main(String[] args) {

        // while, do while, for

        int count = 11;

        while (count < 10) {
            System.out.println(++count);
            //count++;
        }

        do {
            System.out.println("Number: " + count++);
        } while (count < 20);

        // Variavel local precisa ser inicializada antes de se usar
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

    }
}
