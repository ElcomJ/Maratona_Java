package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.List;

/**
 * Aula_188 - <b>Métodos Genéricos</b><br />
 * O <b>T</b> vai atribuir o argumento que for passado para todo o método<br />
 * Usar um método genérico, faz com que ele nâo tenha tido, onde ele vai ser atribuido quando receber algo<br />
 *
 */
public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
//        return List.of(t);
//    }
}
