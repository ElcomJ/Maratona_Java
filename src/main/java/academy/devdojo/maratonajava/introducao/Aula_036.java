package academy.devdojo.maratonajava.introducao;

/**
 * Arrays Multidimensionais pt 01
 */
public class Aula_036 {
    public static void main(String[] args) {

        // 1,2,3,4,5 Meses
        // 31,28,31,30 Dias

        int[][] meses = new int[3][3];     // [Linha][Coluna]

        meses[0][0] = 31;
        meses[0][1] = 23;
        meses[0][2] = 15;

        meses[1][0] = 35;
        meses[1][1] = 22;
        meses[1][2] = 17;

        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[0].length; j++) { // compara o j com o tamanho do array na posição meses[0]
                System.out.println(meses[i][j]);
            }
        }

    }
}
