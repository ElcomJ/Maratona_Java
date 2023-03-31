package academy.devdojo.maratonajava.introducao;

/**
 * Arrays Multidimensionais pt 02 - Foreach
 */
public class Aula_037 {
    public static void main(String[] args) {

        int[][] meses = new int[3][3];

        meses[0][0] = 31;
        meses[0][1] = 23;
        meses[0][2] = 15;

        meses[1][0] = 35;
        meses[1][1] = 22;
        meses[1][2] = 17;

        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) { // compara o j com o tamanho do array na posição meses[i]
                System.out.println(meses[i][j]);
            }
        }

        System.out.println();

        for (int[] arrBase : meses) {        // Usando foreach
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

    }
}
