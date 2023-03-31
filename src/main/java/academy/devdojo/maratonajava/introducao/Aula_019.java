package academy.devdojo.maratonajava.introducao;

/**
 * Operadores pt 05 - Atribuição
 */
public class Aula_019 {
    public static void main(String[] args) {

        // = += -= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --

        int contador = 0;
        contador++;
        contador --;
        ++contador;
        ++contador;
        --contador;

        int contador2 = 0;

        System.out.println(contador2++);
        System.out.println(contador2++);
        System.out.println(++contador2);

    }
}