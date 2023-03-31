package academy.devdojo.maratonajava.introducao;

/**
 * Arrays pt 04 - Foreach
 */
public class Aula_035 {
    public static void main(String[] args) {

        // Foreach percorre todas as posições do array e retorna o seu valor
        // Ela usa uma variável de referência para apontar para os valores na memória

        int[] numeros = new int[3];       // inicializa sem valores
        int[] numeros2 = {1, 2, 3, 4, 5}; // inicializa com valores
        int[] numeros3 = new int[]{1, 2, 3, 4, 5}; // inicializa com valores

        //for (int i = 0; i < numeros3.length; i++) {   // usando for
        //    System.out.println(numeros3[i]);
        //}

        for (int num : numeros3) {      // usando foreach
            System.out.println(num);
        }

    }
}
