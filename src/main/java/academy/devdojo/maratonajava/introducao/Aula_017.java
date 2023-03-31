package academy.devdojo.maratonajava.introducao;

/**
 * Operadores pt 03 - Lógicos AND
 */
public class Aula_017 {
    public static void main(String[] args) {

        // && = AND - Ambos precisam ser TRUE;
        // || = OR  - Somente um precisa ser TRUE;
        // !  = NOT - Inverte a lógica

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

    }
}
