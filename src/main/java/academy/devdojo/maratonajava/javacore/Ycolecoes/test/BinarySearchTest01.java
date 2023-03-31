package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aula_172 - <b>Binary Search</b><br />
 * <b>(-(ponto de inserção) -1)</b><br />
 * Para o Binary Search funcionar a lista PRECISA estar <b>Ordenada</b><br />
 * index 0, 1, 2, 3<br />
 * value 0, 2, 3, 4<br />
 *
 */
public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 2));
    }
}
