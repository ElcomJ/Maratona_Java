package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

/**
 * Aula_093<br />
 */
public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        System.out.println("------------------------------");

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/02/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
