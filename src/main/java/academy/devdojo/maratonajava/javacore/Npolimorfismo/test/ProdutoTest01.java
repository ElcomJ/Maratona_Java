package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

/**
 * Aula_090 | Aula_092<br />
 * Domain = <b>model</b><br />
 * Service = <b>business rules</b><br />
 * Test = <b>Visualization</b><br />
 */
public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung \"50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
