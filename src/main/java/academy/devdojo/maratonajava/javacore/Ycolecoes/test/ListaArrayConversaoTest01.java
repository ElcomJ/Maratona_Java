package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Aula_173 - <b>Lista para Arrays</b><br />
 * Toma cuidado porque o <b>.asList</b> cria um link com o array original<br />
 * <b>asList</b> é imutavel<br />
 * <b>numeros.toArray</b> converte uma Lista para array<br />
 * <b>Arrays.asList</b> converte um array para lista<br />
 *
 */
public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]); // List to Array
        System.out.println(Arrays.toString(listToArray));

        System.out.println("-------------------------------------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); // Nao da para adicionar valor

        arrayToList.set(0, 12);


        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("-------------------------------------------");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray)); // Da para adicionar valor
        numerosList.add(15);

        System.out.println(numerosList);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
    }
}
